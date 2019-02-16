package com.tony.android.virtualmuseum;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ARActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar);

        ArrayList<CategoryItem> ar = new ArrayList<>();
        ar.add(new CategoryItem("Alexander Hamilton",R.drawable.alexanderhamilton));
        ar.add(new CategoryItem("Benedict Arnold",R.drawable.benedictarnold));
        ar.add(new CategoryItem("Benjamin Franklin",R.drawable.benjaminfranklin));
        ar.add(new CategoryItem("Boston Massacre",R.drawable.bostonmassacre));
        ar.add(new CategoryItem("Boston Tea Party",R.drawable.bostonteaparty));
        ar.add(new CategoryItem("Stating the Declaration of Independance",R.drawable.declarationofindependance));
        ar.add(new CategoryItem("Revolutionary War",R.drawable.revolutionarywar));
        ar.add(new CategoryItem("The 8 founding fathers",R.drawable.foundingfathers));
        ar.add(new CategoryItem("Writing the Declaration of Independance",R.drawable.writingdoi));


        CategoryAdapter itemsAdapter = new CategoryAdapter(this,ar);
        GridView gridview = findViewById(R.id.ar_grid_view);
        gridview.setAdapter(itemsAdapter);
    }

}

