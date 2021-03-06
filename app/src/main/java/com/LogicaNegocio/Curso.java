
package com.LogicaNegocio;

public class Curso {
    private String codigo;
    private String nombre;
    private int creditos;
    private int horasSemanales;
    private Ciclo ciclo;
    private Carrera carrera;
    private String nivel;
    

    public Curso(String codigo, String nombre, int creditos, int horasSemanales, Ciclo ciclo, Carrera carrera, String nivel) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.horasSemanales = horasSemanales;
        this.ciclo = ciclo;
        this.carrera=carrera;
        this.nivel = nivel;
    }

    public Curso() {
        this.codigo = "";
        this.nombre = "";
        this.creditos = 0;
        this.horasSemanales = 0;
        this.ciclo = new Ciclo();
        this.carrera=new Carrera();
        this.nivel = "";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
}
