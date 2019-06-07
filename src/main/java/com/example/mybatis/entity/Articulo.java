package com.example.mybatis.entity;

public class Articulo {

    private Long codido;
    private String nombre;
    private String categoria;

    public Long getCodido() {
        return codido;
    }

    public void setCodido(Long codido) {
        this.codido = codido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
