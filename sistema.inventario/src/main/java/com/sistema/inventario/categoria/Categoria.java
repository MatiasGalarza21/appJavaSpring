package com.sistema.inventario.categoria;

import javax.persistence.*;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(length = 45, nullable = false,unique = true)
    private  String nombre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Categoria() {
    }

    public Categoria(Integer id) {
        this.id = id;
    }
    public Categoria(String nombre) {
        this.nombre = nombre;
    }
}
