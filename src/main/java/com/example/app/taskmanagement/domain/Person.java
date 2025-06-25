package com.example.app.taskmanagement.domain;

import com.example.app.base.domain.AbstractEntity;
import com.vaadin.flow.component.template.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Person extends AbstractEntity<Long> {

    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)

    @NotBlank
    private String dni;
    
    @NotBlank
    private String nombre;

    @NotBlank 
    private String apellido;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    

   
}
