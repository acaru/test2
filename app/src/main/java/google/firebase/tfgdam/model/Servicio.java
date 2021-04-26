package google.firebase.tfgdam.model;

import java.io.Serializable;

public class Servicio implements Serializable {

    private int id;
    private String nombre;
    private float precio;

    public Servicio() {
        this(-1, null, -1);
    }

    public Servicio(int id, String nombre, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
