package com.example.scanchiradhakrishna.pokedexgogo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

//import com.example.scanchiradhakrishna.pokedexgogo.R;

/**
 * Created by SCanchiRadhakrishna on 12/6/16.
 */
public class ListPokeAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Pokemon> pkmn;

    public ListPokeAdapter(Context mContext, ArrayList<Pokemon> pkmn) {
        this.mContext = mContext;
        this.pkmn = pkmn;
    }

    @Override
    public int getCount() {
        return pkmn.size();
    }

    @Override
    public Object getItem(int position) {
        return pkmn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return pkmn.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.pkmn_listview,null);
        TextView pkmn_id = (TextView)v.findViewById(R.id.pkmn_id);
        TextView pkmn_name = (TextView)v.findViewById(R.id.pkmn_name);
        TextView pkmn_type1 = (TextView)v.findViewById(R.id.pkmn_type1);
        TextView pkmn_type2 = (TextView)v.findViewById(R.id.pkmn_type2);
        pkmn_id.setText("#" + String.valueOf(pkmn.get(position).getId()));
        pkmn_name.setText(pkmn.get(position).getName());
        pkmn_type1.setText(pkmn.get(position).getType1());
        pkmn_type2.setText(pkmn.get(position).getType2());
        return v;
    }
}
