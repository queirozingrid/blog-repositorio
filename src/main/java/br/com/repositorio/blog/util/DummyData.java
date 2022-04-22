/*
 * package br.com.repositorio.blog.util;
 * 
 * import java.time.LocalDate; import java.util.ArrayList; import
 * java.util.List;
 * 
 * import javax.annotation.PostConstruct;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Component;
 * 
 * import br.com.repositorio.blog.models.Post; import
 * br.com.repositorio.blog.models.Usuario; import
 * br.com.repositorio.blog.repositories.PostRepository;
 * 
 * 
 * @Component public class DummyData {
 * 
 * @Autowired PostRepository postRepository;
 * 
 * @PostConstruct public void savePosts() { Usuario autor2 = new Usuario();
 * autor2.setEmail("autor5@gmail.com"); autor2.setNome("Autor 5");
 * autor2.setSenha("123");
 * 
 * List<Usuario> autores = new ArrayList<Usuario>(); autores.add(autor2);
 * 
 * Post post = new Post(); post.setConteudo("O conteúdo ficará aqui");
 * post.setTitulo("Meu terceiro post"); post.setDataPublicacao(LocalDate.now());
 * post.setAutor(autores); postRepository.save(post);
 * 
 * 
 * }
 * 
 * 
 * }
 */