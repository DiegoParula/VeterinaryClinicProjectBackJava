package com.clinicaveterinaria.vet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MascotaDuenioDto {
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_duenio;
    private String apellido_duenio;

}
