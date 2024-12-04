package com.clinicaveterinaria.vet.service.impl;

import com.clinicaveterinaria.vet.dto.MascotaDuenioDto;
import com.clinicaveterinaria.vet.entity.Mascota;
import com.clinicaveterinaria.vet.repository.IMascotaRepository;
import com.clinicaveterinaria.vet.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascotaRepository;

    @Override
    public List<Mascota> listaMascotas() {
        List<Mascota> mascotas = mascotaRepository.findAll();
        return mascotas;
    }

    @Override
    public void guardaMascota(Mascota mascota) {
        mascotaRepository.save(mascota);

    }

    @Override
    public void eliminaMascota(Long id) {
        mascotaRepository.deleteById(id);
    }

    @Override
    public void editaMascota(Mascota mascota) {
        this.mascotaRepository.save(mascota);
    }

    @Override
    public Mascota buscaMascotaPorId(Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Mascota> buscaMascotasPorRaza(String raza) {
        List<Mascota> listaMascota = this.listaMascotas();
        List<Mascota> listaMascotaRaza = new ArrayList<>();
        for (Mascota mascota : listaMascota) {
            System.out.println(mascota.getRaza()+raza);
            if (mascota.getRaza() != null && raza != null && mascota.getRaza().trim().equalsIgnoreCase(raza.trim())) {
                System.out.println("Coincidencia: " + mascota.getNombre());
                listaMascotaRaza.add(mascota);
            }
        }

        return listaMascotaRaza;
    }

    @Override
    public List<MascotaDuenioDto> listarMascotaDuenio() {
        List<Mascota> listaMascota = this.listaMascotas();
        List<MascotaDuenioDto> listaDuenioDto = new ArrayList<>();
        MascotaDuenioDto mascotaDuenioDto = new MascotaDuenioDto();
        for (Mascota mascota : listaMascota) {
            mascotaDuenioDto.setNombre_duenio(mascota.getDuenio().getNombre());
            mascotaDuenioDto.setNombre_mascota(mascota.getNombre());
            mascotaDuenioDto.setRaza(mascota.getRaza());
            mascotaDuenioDto.setApellido_duenio(mascota.getDuenio().getApellido());
            mascotaDuenioDto.setEspecie(mascota.getEspecie());
            listaDuenioDto.add(mascotaDuenioDto);
            mascotaDuenioDto = new MascotaDuenioDto();
        }
        return listaDuenioDto;
    }
}
