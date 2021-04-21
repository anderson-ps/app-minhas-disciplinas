package br.edu.unis.minhasdisciplinas.dao;

import java.util.ArrayList;

import br.edu.unis.minhasdisciplinas.model.Disciplina;

public class DisciplinaDao {

    private final static ArrayList<Disciplina> listaDisciplina = new ArrayList<>();

    public void salvar(Disciplina disciplina){
        this.listaDisciplina.add(disciplina);
    }

    public ArrayList<Disciplina> buscarTodos(){
        return new  ArrayList<>(listaDisciplina);
    }
}
