/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DCI
 */
public class BD {

    public String SQL;
    public String user;
    public String pass;
    public Connection con;
    public Statement stmt;
    public ResultSet resultado;
    public int cantColumnas;
    public String getColumna;
    public String url;
    
    public String[] datos;
    
    public BD() {
       url="jdbc:mysql://localhost/tarea1";  
       user="root";
       pass="";
        
    }
    
    public void consultar(){
       try{ 
        Class.forName("org.gjt.mm.mysql.Driver");
        //Class.forName("com.mysql.jdbc.Driver");
        
        con=DriverManager.getConnection(url,user,pass);
        stmt=con.createStatement(); 
        SQL="select * from alumno";
        resultado=stmt.executeQuery(SQL);
        
        while(resultado.next()){
            String rut=resultado.getString("rut");
            String nombre= resultado.getString("nombre");
            String apellido = resultado.getString("apellido");
            int fecha_nacimiento = resultado.getInt("fecha_nacimiento");
            String direccion = resultado.getString("direccion");
            String telefono = resultado.getString("telefono");
            String carrera = resultado.getString("carrera");
            int anio_ingreso = resultado.getInt("anio_ingreso");
            
            String[] datos = {rut, nombre, apellido, direccion, telefono, carrera};
         
            System.out.println("-------------------------------------");
            System.out.println("RUT: "+rut);
            System.out.println("NOMBRE: "+nombre);
            System.out.println("APELLIDO: "+apellido);
            System.out.println("FECHA NACIMIENTO: " + fecha_nacimiento);
            System.out.println("DIRECCION: " + direccion);
            System.out.println("TELEFONO: " + telefono);
            System.out.println("CARRERA: "+carrera);
            System.out.println("AÑO INGRESO: " + anio_ingreso);
            System.out.println("-------------------------------------");
        }
        con.close();
        }catch(ClassNotFoundException e){
            System.out.println("No encuentra clase " + e.getMessage());
        }catch(SQLException e){
            System.out.println("Error conexion " + e.getMessage());
        }
    }
    
    public void insertar(String rut, String nombre, String apellido, int fecha_nacimiento, String direccion, String telefono, String carrera, int anio_ingreso){

       try{
        Class.forName("org.gjt.mm.mysql.Driver");
        //Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,user,pass);
        stmt=con.createStatement(); 
        SQL="insert into alumno values('"+rut+"','"+nombre+"','"+apellido+"',"+fecha_nacimiento+",'"+direccion+"','"+telefono+"','"+carrera+"',"+anio_ingreso+")";
        stmt.execute(SQL);
        System.out.println("CONSULTA INSERTADA!");
        con.close();
       }catch(ClassNotFoundException e){
          System.out.println("No encuentra clase");
       }catch(SQLException e){
           System.out.println("Error conexion");
       }
    }    

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
