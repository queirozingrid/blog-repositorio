package br.com.repositorio.blog.service;

import java.util.List;

import br.com.repositorio.blog.models.Post;

public interface PostService {
	List<Post> findAll();
	Post findById(Integer id);
	Post save(Post post);
}
