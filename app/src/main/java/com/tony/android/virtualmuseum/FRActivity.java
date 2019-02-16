package com.tony.android.virtualmuseum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class FRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fr);

        ArrayList<CategoryItem> fr = new ArrayList<>();
        fr.add(new CategoryItem("Louis XVI summons the Estates General",R.drawable.louisxviestates));
        fr.add(new CategoryItem("The ''Tennis Court Oath''",R.drawable.tenniscourtoath));
        fr.add(new CategoryItem("Storming Bastille",R.drawable.stormingbastille));
        fr.add(new CategoryItem("National Assembly abolishes the nobility",R.drawable.nationalassemblyabolishingnobilty));
        fr.add(new CategoryItem("First use of the Guillotine",R.drawable.guillotine));
        fr.add(new CategoryItem("Louis XVI executed",R.drawable.louisxviexecuted));
        fr.add(new CategoryItem("Robespierre executed",R.drawable.robespierreexecution));

        CategoryAdapter itemsAdapter = new CategoryAdapter(this,fr);
        GridView gridView = findViewById(R.id.fr_grid_view);
        gridView.setAdapter(itemsAdapter);
    }
}
