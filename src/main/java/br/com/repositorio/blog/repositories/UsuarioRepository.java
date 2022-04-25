package br.com.repositorio.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.repositorio.blog.models.Post;
import br.com.repositorio.blog.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	@Query(
			value = "select p from Post p inner join post_autor pa where pa.autor_id = ?1"
	)
	List<Post> findPostsByUsuarioId(Integer id);

}
