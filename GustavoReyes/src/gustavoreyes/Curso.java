/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gustavoreyes;

/**
 *
 * @author UPLA
 */
public class Curso {
    String clave;
    String nombre;
    int creditos;
    int semestre;
    String profesor;
    int alumnos_inscritos;

    
    // Constructor
    public Curso(String clave, String nombre, int creditos, int semestre, String profesor, int alumnos_inscritos) {
        this.clave = clave;
        this.nombre = nombre;
        this.creditos = creditos;
        this.semestre = semestre;
        this.profesor = profesor;
        this.alumnos_inscritos = alumnos_inscritos;
    }

    // Getters
    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getProfesor() {
        return profesor;
    }

    public int getAlumnos_inscritos() {
        return alumnos_inscritos;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void setAlumnos_inscritos(int alumnos_inscritos) {
        this.alumnos_inscritos = alumnos_inscritos;
    }
    
    
}
