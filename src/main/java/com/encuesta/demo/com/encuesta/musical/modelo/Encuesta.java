package com.encuesta.demo.com.encuesta.musical.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "encuesta")
@Entity
public class Encuesta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column(name = "estilo", length = 256, nullable = false)
	String estilo;
	@Column(name = "email", length = 256, nullable = false)
	String email;

	public Encuesta() {

	}

	public Encuesta(long id, String estilo, String email) {
		super();
		this.id = id;
		this.estilo = estilo;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	 	
}
