package com.clinicaveterinaria.vet.service.impl;

import com.clinicaveterinaria.vet.entity.Duenio;
import com.clinicaveterinaria.vet.repository.IDuenioRepository;
import com.clinicaveterinaria.vet.service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenioService implements IDuenioService {

    @Autowired
    private IDuenioRepository duenioRepository;

    @Override
    public List<Duenio> listarDuenios() {
        List<Duenio> duenios = duenioRepository.findAll();
        return duenios;
    }

    @Override
    public void guardarDuenio(Duenio duenio) {
        duenioRepository.save(duenio);
    }

    @Override
    public void eliminarDuenio(Long id) {
        duenioRepository.deleteById(id);
    }

    @Override
    public Duenio buscarDuenioPorId(Long id) {
        return duenioRepository.findById(id).orElse(null);
    }

    @Override
    public void editarDuenio(Duenio duenio) {
        this.guardarDuenio(duenio);
    }
}
