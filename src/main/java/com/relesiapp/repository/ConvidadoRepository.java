package com.relesiapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.relesiapp.models.Convidado;
import com.relesiapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {

	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);

	
	
}
