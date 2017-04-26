package br.com.data.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.com.data.entity.Usuario;

@org.springframework.stereotype.Repository
public interface UsuarioRepository extends Repository<Usuario, Long>{
	
	List<Usuario> findBySobreNome(String sobreNome);

}
