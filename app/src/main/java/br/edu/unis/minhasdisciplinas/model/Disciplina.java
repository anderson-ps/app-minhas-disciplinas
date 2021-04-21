package br.edu.unis.minhasdisciplinas.model;

public class Disciplina {

    private String titulo;
    private double cargaHoraria;

    public Disciplina(String titulo,double cargaHoraria){
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public String toString(){
        return this.titulo + " / " + this.cargaHoraria;
    }
}
