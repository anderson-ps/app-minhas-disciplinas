package br.edu.unis.minhasdisciplinas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import br.edu.unis.minhasdisciplinas.R;
import br.edu.unis.minhasdisciplinas.adapter.ListaDisciplinasAdapter;
import br.edu.unis.minhasdisciplinas.dao.DisciplinaDao;

public class ListaDisciplinasActivity extends AppCompatActivity {

    ListView listaDisciplinas;
    DisciplinaDao dao = new DisciplinaDao();

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
        this.dao = new DisciplinaDao();
        ListaDisciplinasAdapter adapter = new ListaDisciplinasAdapter(this);
        adapter.addAll(dao.buscarTodos());
        listaDisciplinas.setAdapter(adapter);
    }
}