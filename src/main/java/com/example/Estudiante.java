package com.example;

public class Estudiante {


 private String nombre;
 private int edad;
 private double Promedio;



public Estudiante() 
{
    this.nombre = "desconocido";
    this.edad = 12;
    this.Promedio = 0.0;
}

public Estudiante(String nombre, int edad , double Promedio) 
{
    this.nombre = nombre;
    this.edad = edad;
    this.Promedio = Promedio;

}

public String getNombre() {
    return nombre;
}

public int getEdad() {
    return edad;
}

public double getPromedio() {
    return Promedio;
}




public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public void setPromedio(double promedio) {
    Promedio = promedio;
}

public boolean haAprobado() {
    if (Promedio >= 3.0) {
        System.out.println( "El estudiante ha aprobado");
        return true;
    } else {
        System.out.println( "El estudiante ha reprobado");
        return false;
        
    }


}


public void mostrarInfo(){
System.out.println( "Nombre:" + nombre + " Edad:" + edad + " Aprobado:" + haAprobado());

}



}





