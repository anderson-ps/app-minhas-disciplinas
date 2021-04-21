package br.edu.unis.minhasdisciplinas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import br.edu.unis.minhasdisciplinas.R;

public class ListaDisciplinasActivity extends AppCompatActivity {

    ListView listaDisciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_disciplinas);
        carregarWidgets();
        configurarListaDisciplinas();

    }

    private void carregarWidgets() {
        listaDisciplinas = findViewById(R.id.lista_disciplinas);
    }

    private void configurarListaDisciplinas() {

        //implementar o adapter da lista de disciplinas
        //listaDisciplinas.setAdapter();
    }
}