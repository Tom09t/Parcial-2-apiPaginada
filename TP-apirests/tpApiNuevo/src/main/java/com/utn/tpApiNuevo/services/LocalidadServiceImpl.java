package com.utn.tpApiNuevo.services;

import com.utn.tpApiNuevo.entities.Localidad;
import com.utn.tpApiNuevo.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository){

        super(baseRepository);

    }

}
