package br.com.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nmePerfil;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNmePerfil() {
		return nmePerfil;
	}

	public void setNmePerfil(String nmePerfil) {
		this.nmePerfil = nmePerfil;
	}
	
	
	
}
