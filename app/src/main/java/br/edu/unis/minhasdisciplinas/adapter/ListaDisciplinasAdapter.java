package br.edu.unis.minhasdisciplinas.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import br.edu.unis.minhasdisciplinas.R;
import br.edu.unis.minhasdisciplinas.model.Disciplina;

public class ListaDisciplinasAdapter extends BaseAdapter {

    private final ArrayList<Disciplina> disciplina = new ArrayList<>();
    private final Context context;

    public ListaDisciplinasAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View viewCriada = LayoutInflater.from(this.context).inflate(R.layout.item_disciplina, parent,   false);

        return viewCriada;
    }


}