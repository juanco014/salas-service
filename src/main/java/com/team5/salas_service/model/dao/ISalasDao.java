package com.team5.salas_service.model.dao;

import com.team5.salas_service.model.entities.Salas;
import org.springframework.data.repository.CrudRepository;

public interface ISalasDao extends CrudRepository<Salas, Long> {

}
