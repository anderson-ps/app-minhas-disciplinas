package br.edu.unis.minhasdisciplinas.model;

public class Disciplina {

    private final int id;
    private final String titulo;
    private final double cargaHoraria;

    public Disciplina(int id,String titulo,double cargaHoraria){
        this.id = id;
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
    }

    public int getId(){
        return this.id;
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
