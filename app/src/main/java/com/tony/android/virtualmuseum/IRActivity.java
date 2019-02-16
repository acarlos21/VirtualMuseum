package com.tony.android.virtualmuseum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class IRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ir);

        ArrayList<CategoryItem> ir = new ArrayList<>();
        ir.add(new CategoryItem("First Central Bank in England",R.drawable.englandbank));
        ir.add(new CategoryItem("Thomas Newcomen made the First Steam Engine",R.drawable.thomasnewcomensteam));
        ir.add(new CategoryItem("John Lombe starts his first silk factory",R.drawable.johnlombesilk));
        ir.add(new CategoryItem("Combination Acts",R.drawable.combinationacts));
        ir.add(new CategoryItem("10 million tons of coal mined in England",R.drawable.coalminesengland));
        ir.add(new CategoryItem("First Factory Act",R.drawable.factoryact));
        ir.add(new CategoryItem("Friedrich Engel",R.drawable.friedrichengels));
        ir.add(new CategoryItem("Karl Marx",R.drawable.karlmarx));
        ir.add(new CategoryItem("''The Communist Manifesto''",R.drawable.thecommunistmanifesto));




        CategoryAdapter itemsAdapter = new CategoryAdapter(this,ir);
        GridView gridView = findViewById(R.id.ir_grid_view);
        gridView.setAdapter(itemsAdapter);
    }
}
