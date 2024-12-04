package com.clinicaveterinaria.vet.service;

import com.clinicaveterinaria.vet.dto.MascotaDuenioDto;
import com.clinicaveterinaria.vet.entity.Mascota;

import java.util.List;

public interface IMascotaService {
    public List<Mascota> listaMascotas();
    public void guardaMascota(Mascota mascota);
    public void eliminaMascota(Long id);
    public void editaMascota(Mascota mascota);
    public Mascota buscaMascotaPorId(Long id);
    public List<Mascota> buscaMascotasPorRaza(String raza);
    public List<MascotaDuenioDto> listarMascotaDuenio();
}
