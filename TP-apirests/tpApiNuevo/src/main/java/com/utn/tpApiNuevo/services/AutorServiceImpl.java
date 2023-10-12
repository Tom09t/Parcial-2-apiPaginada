package com.utn.tpApiNuevo.services;

import com.utn.tpApiNuevo.entities.Autor;
import com.utn.tpApiNuevo.repositories.AutorRepository;
import com.utn.tpApiNuevo.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository){
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}
