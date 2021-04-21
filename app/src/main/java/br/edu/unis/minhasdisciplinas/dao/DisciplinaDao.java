package br.edu.unis.minhasdisciplinas.dao;

import java.util.ArrayList;

import br.edu.unis.minhasdisciplinas.model.Disciplina;

public class DisciplinaDao {

    private final static ArrayList<Disciplina> listaDisciplina = new ArrayList<>();

    public DisciplinaDao(){
        carregarDisciplinas();
    }

    public void salvar(Disciplina disciplina){
        this.listaDisciplina.add(disciplina);
    }

    public void carregarDisciplinas(){
        Disciplina d1 = new Disciplina(1,"Teoria da Computação",40);
        Disciplina d2 = new Disciplina(2,"Analise de Algortimos",40);
        Disciplina d3 = new Disciplina(3,"Computação Cognitiva",80);
        Disciplina d4 = new Disciplina(4,"Aplicações Moveis",60);
        Disciplina d5 = new Disciplina(5,"Banco de Dados",80);

        listaDisciplina.add(d1);
        listaDisciplina.add(d2);
        listaDisciplina.add(d3);
        listaDisciplina.add(d4);
        listaDisciplina.add(d5);
    }

    public ArrayList<Disciplina> buscarTodos(){
        return new  ArrayList<>(listaDisciplina);
    }
}
