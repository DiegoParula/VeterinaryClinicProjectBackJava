package com.clinicaveterinaria.vet.service;

import com.clinicaveterinaria.vet.entity.Duenio;

import java.util.List;

public interface IDuenioService {

    public List<Duenio> listarDuenios();
    public void guardarDuenio(Duenio duenio);
    public void eliminarDuenio(Long id);
    public Duenio buscarDuenioPorId(Long id);
    public void editarDuenio(Duenio duenio);

}
