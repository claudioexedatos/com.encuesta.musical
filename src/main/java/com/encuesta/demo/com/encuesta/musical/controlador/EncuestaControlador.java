package com.encuesta.demo.com.encuesta.musical.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encuesta.demo.com.encuesta.musical.modelo.Encuesta;
import com.encuesta.demo.com.encuesta.musical.repositorio.EncuestaRepositorio;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class EncuestaControlador {

	@Autowired
	private EncuestaRepositorio repositorio;
	
	@GetMapping("/encuestas")
	public List<Encuesta> listarTodasLasEncuestas(){
		return repositorio.findAll();
	}
	
	/* método guarda la encuesta */
	@PostMapping("/encuestas")
	public Encuesta guardarEncuesta(@RequestBody Encuesta encuesta) {
		return repositorio.save(encuesta);
	}
}
