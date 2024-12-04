package com.clinicaveterinaria.vet.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.processing.Pattern;

@Entity
@Getter
@Setter

@Table(name = "MASCOTA")
public class Mascota {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    @ManyToOne
    @JoinColumn(name="id_duenio", referencedColumnName = "id")
    private Duenio duenio;

    public Mascota() {
    }

    public Mascota(String color, String raza, String especie, String nombre, Long id) {
        this.color = color;
        this.raza = raza;
        this.especie = especie;
        this.nombre = nombre;
        this.id = id;
    }
}
