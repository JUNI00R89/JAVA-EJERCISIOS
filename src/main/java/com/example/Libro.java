package com.example;

public class Libro {
    private String titulo;
    private String autor;
    private int Paginas;

    public Libro() {

        this.titulo = "Desconocido";
        this.autor = "Anonimo";
        this.Paginas = 0;
    }

    public Libro(String titulo, String autor) {

        this.titulo = titulo;
        this.Paginas = 0;
        this.autor = autor;

    }

    public Libro(String autor, String titulo, int Paginas) {

        this.titulo = " FOCO PANDA";
        this.Paginas = 45;
        this.autor = "Anonimo";

    }

    public void mostrarDetalles() {
        System.out.println("Libro:" + titulo + " Autor:" + autor + " Paginas:" + Paginas);

    }

    // @Override
    // public String toString() {
    // return "libro [titulo=" + titulo + ", autor=" + autor + ", Paginas=" +
    // Paginas + "]";
    // }
}
