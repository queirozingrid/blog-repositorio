package br.com.repositorio.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.repositorio.blog.models.Usuario;
import br.com.repositorio.blog.service.UsuarioService;

@Controller
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
	public ModelAndView encontrarPorId(@PathVariable("id") Integer id) {
		Usuario usuario = new Usuario();
		usuario = usuarioService.findById(id);
		
		ModelAndView mv = new ModelAndView("usuario");
		mv.addObject("usuario", usuario);
		return mv;
	}
}
