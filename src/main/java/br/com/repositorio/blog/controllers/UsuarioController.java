package br.com.repositorio.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.repositorio.blog.models.Post;
import br.com.repositorio.blog.models.Usuario;
import br.com.repositorio.blog.service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "{id}")
	public ModelAndView encontrarPorId(@PathVariable Integer id) {
		Usuario usuario = new Usuario();
		usuario = usuarioService.findById(id);
		
		ModelAndView mv = new ModelAndView("usuario");
		mv.addObject("usuario", usuario);
		return mv;
	}
	
	@GetMapping("posts/{id}")
	public List<Post> encontrarTodosPosts(@PathVariable Integer id){
		return usuarioService.findPostsByUsuarioId(id);
	}
	
	
	
}
