package com.tony.android.virtualmuseum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HistoryDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_detail);

        Intent i = getIntent();
        TextView textView = (TextView)findViewById(R.id.name_text_view);
        textView.setText(i.getStringExtra("name"));

        ImageView imageView= (findViewById(R.id.item_image_view));
        imageView.setImageResource(i.getIntExtra("nameImg",0));

        TextView nameDescriptionView = findViewById(R.id.name_description_view);
        nameDescriptionView.setText(i.getStringExtra("description"));
    }
}
