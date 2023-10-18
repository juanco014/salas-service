package com.team5.salas_service.model.service;

import com.team5.salas_service.model.dao.ISalasDao;
import com.team5.salas_service.model.entities.Salas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SalasServiceImpl implements ISalasService {

    @Autowired
    ISalasDao salasDao;


    @Override
    public void delete (Salas salas){salasDao.delete(salas);}

    @Override
    public void modificar(Salas salas) {salasDao.save(salas);
    }

    @Override
    public void cantComputadores(Salas salas) {salasDao.save(salas);
    }
    @Transactional(readOnly = true)
    @Override
    public List<Salas> findAll() {
        List<Salas> salas = (List<Salas>) salasDao.findAll();
        return salas;
    }

    @Override
    public Salas findByid(long id) {
        return (Salas) salasDao.findById(id).get();
    }

    @Override
    public Salas save(Salas salas) {
        return null;
    }
}