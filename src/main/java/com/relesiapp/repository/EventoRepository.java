package com.relesiapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.relesiapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{

	Evento findByCodigo(long codigo);
}
