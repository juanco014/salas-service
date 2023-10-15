package com.team5.salas_service.model.service;

import com.team5.salas_service.model.entities.Salas;

import java.util.List;

public interface ISalasService {

    void delete(Salas salas);

    void modificar(Salas salas);




    List<Salas> findAll();

    Salas findByid(long id);

    Salas save(Salas salas);
}
