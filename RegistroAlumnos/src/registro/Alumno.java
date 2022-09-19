/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registro;

/**
 *
 * @author Gustavo
 */
public class Alumno {

    // Declaracion de variables.
    String nombre;
    int edad;
    String carrera;
    int duracion;
    int arancel;
    int ramosAprobados;
    
    // Constructor inicial.
    public Alumno(String nombre, int edad, String carrera, int duracion, int arancel, int ramosAprobados) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.duracion = duracion;
        this.arancel = arancel;
        this.ramosAprobados = ramosAprobados;
    }

    // Getters.
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getArancel() {
        return arancel;
    }

    public int getRamosAprobados() {
        return ramosAprobados;
    }
    
    // Setters.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setArancel(int arancel) {
        this.arancel = arancel;
    }

    public void setRamosAprobados(int ramosAprobados) {
        this.ramosAprobados = ramosAprobados;
    }

    // Concatenacion de resultados.
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + ", duracion=" + duracion + ", arancel=" + arancel + ", ramosAprobados=" + ramosAprobados + '}';
    }
    
}
