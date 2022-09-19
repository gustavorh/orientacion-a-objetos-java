/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author UPLA
 */
public class Alumno {
    String alumno;
    String carrera;
    int edad;

    public Alumno(String alumno, String carrera, int edad) {
        this.alumno = alumno;
        this.carrera = carrera;
        this.edad = edad;
    }

    public String getAlumno() {
        return alumno;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "alumno=" + alumno + ", carrera=" + carrera + ", edad=" + edad + '}';
    }
    
    
    
    
}
