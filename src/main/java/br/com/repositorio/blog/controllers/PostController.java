package br.com.repositorio.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.repositorio.blog.models.Post;
import br.com.repositorio.blog.service.PostService;

@Controller
public class PostController {
	
	@Autowired
	PostService postService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	//@GetMapping("/posts")
	public ModelAndView listarTodos(){
		List<Post> posts = postService.findAll();
		ModelAndView mv = new ModelAndView("posts");
		mv.addObject("posts", posts);
		return mv;
	}
	
	
	@RequestMapping(value = "/post/{id}", method = RequestMethod.GET)
	public ModelAndView encontrarPorId(@PathVariable("id") Integer id) {
		Post post = new Post();
		post = postService.findById(id);
		
		ModelAndView mv = new ModelAndView("post");
		mv.addObject("post", post);
		return mv;
	}
}
