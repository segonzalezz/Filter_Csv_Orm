package org.eamsoft.orm.modelo;

public class Cotizante {
    private String nombre;
    private String documento;
    private int edad;
    private int semanasCotizadas;

    public Cotizante(String nombre, String documento, int edad, int semanasCotizadas) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.semanasCotizadas = semanasCotizadas;
    }

    public Cotizante() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSemanasCotizadas() {
        return semanasCotizadas;
    }

    public void setSemanasCotizadas(int semanasCotizadas) {
        this.semanasCotizadas = semanasCotizadas;
    }

    @Override
    public String toString() {
        return "Cotizante{" +
                "nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", edad=" + edad +
                ", semanasCotizadas=" + semanasCotizadas +
                '}';
    }
}
