package com.example;

public class CuentaBancaria {

 private String titular; 
 private double saldo; 
private  double  saldoInicial; 



public CuentaBancaria( String titular , double saldo){
this.titular = titular;


if(saldoInicial < 0 ) {
this.saldo = 0;
} else {
this.saldo = saldoInicial;
};




} //fin de clase 


public String getTitular() {
    return titular;
}


public void setTitular(String titular) {
    this.titular = titular;
}


public double getSaldo() {
    return saldo;
}


public void depositar( double cantidad) {

    if (cantidad > 0) {

    saldo += cantidad;

System.out.println("Se agrego el saldo. Nuevo saldo: " + saldo);

} else {

    System.out.println("La cantidad debe ser mayor que 0.");

}

}


public void retirar(double cantidad) 
{
if (cantidad > 0 && cantidad <= saldo) {

    saldo -= cantidad;

    System.out.println("Se retiro . Nuevo saldo: " + saldo);

} else {

    System.out.println("La cantidad debe ser mayor que 0 y menor o igual al saldo actual.");
}











}






}


