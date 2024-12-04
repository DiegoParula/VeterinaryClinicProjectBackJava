package com.clinicaveterinaria.vet.controller;

import com.clinicaveterinaria.vet.dto.MascotaDuenioDto;
import com.clinicaveterinaria.vet.entity.Mascota;
import com.clinicaveterinaria.vet.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascota")
public class MascotaController {

    @Autowired
    private IMascotaService mascotaService;

    @GetMapping
    public List<Mascota> listarMascotas(){
        return mascotaService.listaMascotas();
    }

    @PostMapping
    public String ingresarMascota(@RequestBody Mascota mascota){
        mascotaService.guardaMascota(mascota);
        return "Mascota guardada correctamente";
    }

    @DeleteMapping("/{id}")
    public String eliminarMascota(@PathVariable Long id){
        mascotaService.eliminaMascota(id);
        return "Mascota eliminada correctamente";
    }

    @PutMapping
    public Mascota actualizarMascota(@RequestBody Mascota mascota){
        mascotaService.editaMascota(mascota);
        return mascotaService.buscaMascotaPorId(mascota.getId());
    }

    @GetMapping("/raza")
    public List<Mascota> listarMascotasRaza(@RequestParam String raza){
        return mascotaService.buscaMascotasPorRaza(raza);

    }

    @GetMapping("/duenios")
    public List<MascotaDuenioDto> listarMascotasDuenio(){
        return mascotaService.listarMascotaDuenio();
    }
}
