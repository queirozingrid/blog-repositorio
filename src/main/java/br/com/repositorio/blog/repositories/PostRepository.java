package br.com.repositorio.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.repositorio.blog.models.Post;

@Repository
public interface PostRepository  extends JpaRepository<Post, Integer>{

}
