package com.example;

public class Main {
    public static void main(String[] args) {

        libro libro1 = new libro("FOCO PÁNDA",   "J.K"   ,     90);

        libro1.mostrarDetalles();


System.out.println("-----------------------------");



CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
cuenta.depositar( 200);
System.out.println(cuenta.getSaldo()); //  ser 700
cuenta.retirar(1000); // va mostrar error de fondos insuficientes
System.out.println(cuenta.getSaldo()); // seguir siendo 700


System.out.println("-----------------------------");


Estudiante e = new Estudiante("Pedro", 21, 2.5);
e.mostrarInfo(); // Debería indicar REPROBADO










    }
}