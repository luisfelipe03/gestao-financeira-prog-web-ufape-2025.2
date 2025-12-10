package br.com.ufape.gestaofinanceiraapi.services;

import br.com.ufape.gestaofinanceiraapi.dto.categoria.CategoriaCreateDTO;
import br.com.ufape.gestaofinanceiraapi.dto.categoria.CategoriaUpdateDTO;
import br.com.ufape.gestaofinanceiraapi.entities.CategoriaEntity;

import java.util.List;

public interface CategoriaService {
    CategoriaEntity criarCategoria(CategoriaCreateDTO categoriaCreateDTO, String userId);

    List<CategoriaEntity> listarCategorias(String userId);

    List<CategoriaEntity> listarCategoriasDespesas(String userId);

    List<CategoriaEntity> listarCategoriasReceitas(String userId);

    CategoriaEntity atualizarCategoria(String uuid, CategoriaUpdateDTO novaCategoria, String userId);

    void excluirCategoria(String uuid, String userId);

    CategoriaEntity criarSemCategoria(String userId, String tipo);
}
