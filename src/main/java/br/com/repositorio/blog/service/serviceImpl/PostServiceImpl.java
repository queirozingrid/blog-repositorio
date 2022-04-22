package br.com.repositorio.blog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.repositorio.blog.models.Post;
import br.com.repositorio.blog.repositories.PostRepository;
import br.com.repositorio.blog.service.PostService;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	PostRepository postRepository;
	
	@Override
	public List<Post> findAll(){
		return postRepository.findAll();
	}
	
	@Override
	public Post findById(Integer id) {
		return postRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return postRepository.save(post);
	}
	
	
}
