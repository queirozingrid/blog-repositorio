package br.com.repositorio.blog.service;

import java.util.List;

import br.com.repositorio.blog.models.Post;
import br.com.repositorio.blog.models.Usuario;

public interface UsuarioService {
	List<Usuario> findAll();
	Usuario findById(Integer id);
	Usuario save(Usuario usuario);
	List<Post> findPostsByUsuarioId(Integer id);
}
