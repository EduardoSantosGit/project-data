package br.com.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.data.entity.Usuario;
import br.com.data.repository.UsuarioRepository;

@Controller
@RequestMapping("usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@RequestMapping
	public ModelAndView index(){
		
		//List<Usuario> usuarios = usuarioRepository.findBySobreNome("santos");
		
		List<Usuario> usuarios = usuarioRepository.findAll();
		
		for(Usuario usu : usuarios){
			System.out.println(usu.getNome());
			System.out.println(usu.getPerfil().getNmePerfil());
		}
		
	return new ModelAndView("Init.Inicio");	
	}

}
