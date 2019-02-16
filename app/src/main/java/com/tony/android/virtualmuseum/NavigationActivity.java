package com.tony.android.virtualmuseum;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.betterarsong);
        mediaPlayer.start();
    }

    public void americanRevolution(View view) {
        Intent i = new Intent(this, ARActivity.class);
        startActivity(i);
    }

    public void frenchRevolution(View view) {
        Intent i = new Intent(this, FRActivity.class);
        startActivity(i);
    }

    public void industrialRevolution(View view) {
        Intent i = new Intent(this, IRActivity.class);
        startActivity(i);
    }

    public void ticket(View view) {
        Intent i = new Intent(this, TicketActivity.class);
        startActivity(i);
    }

    public void faq(View view) {
        Intent i = new Intent(this, FaqActivity.class);
        startActivity(i);
    }

    public void about(View view) {
        Intent i = new Intent(this, AboutActivity.class);
        startActivity(i);
    }

//    So I need to allow the tickets button to go to a new page, once i get to that page
//    set up from the things on the mini store, that page's java will set me up for the outcome to email?
}
