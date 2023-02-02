package com.encuesta.demo.com.encuesta.musical.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encuesta.demo.com.encuesta.musical.modelo.Encuesta;

@Repository
public interface EncuestaRepositorio extends JpaRepository<Encuesta, Long> {

}
