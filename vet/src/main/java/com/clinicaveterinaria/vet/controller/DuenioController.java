package com.clinicaveterinaria.vet.controller;

import com.clinicaveterinaria.vet.entity.Duenio;
import com.clinicaveterinaria.vet.service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/duenio")
public class DuenioController {

    private IDuenioService duenioService;
    @Autowired
    public DuenioController(IDuenioService duenioService) {
        this.duenioService = duenioService;
    }

    @GetMapping
    public List<Duenio> listarDuenios()
    {return duenioService.listarDuenios();}

    @PostMapping
    public String ingresarDuenio(@RequestBody Duenio duenio){
        duenioService.guardarDuenio(duenio);
        return "Duenio guardado correctamente";
    }

    @DeleteMapping("/{id}")
    public String eliminarDuenio(@PathVariable Long id){
        duenioService.eliminarDuenio(id);
        return "Duenio eliminado correctamente";
    }

    @PutMapping
    public Duenio modificarDuenio(@RequestBody Duenio duenio){
        duenioService.guardarDuenio(duenio);
        return duenioService.buscarDuenioPorId(duenio.getId());
    }

}
