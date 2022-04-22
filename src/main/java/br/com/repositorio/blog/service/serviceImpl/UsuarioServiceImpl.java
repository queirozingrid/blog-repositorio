package br.com.repositorio.blog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.repositorio.blog.models.Usuario;
import br.com.repositorio.blog.repositories.UsuarioRepository;
import br.com.repositorio.blog.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario findById(Integer id) {
		return usuarioRepository.findById(id).get();
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	
}
