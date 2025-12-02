# Stage 1: Build
FROM maven:3.9.5-eclipse-temurin-17 AS build

WORKDIR /app

# Copiar arquivos de configuração do Maven
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

# Baixar dependências (camada cacheável)
RUN mvn dependency:go-offline -B

# Copiar código fonte
COPY src ./src

# Compilar e empacotar a aplicação
RUN mvn clean package -DskipTests

# Stage 2: Runtime
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Criar usuário não-root para segurança
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

# Copiar o JAR da aplicação do stage de build
COPY --from=build /app/target/*.jar app.jar

# Expor a porta da aplicação
EXPOSE 8080

# Configurar variáveis de ambiente padrão
ENV JAVA_OPTS="-Xmx512m -Xms256m"

# Comando para executar a aplicação
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]

