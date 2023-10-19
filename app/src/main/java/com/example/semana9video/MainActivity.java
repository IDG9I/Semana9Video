package com.example.semana9video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView mivision = findViewById(R.id.viVision);

        String videoop = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videoop);

        mivision.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        mivision.setMediaController(mediaController);
        mediaController.setAnchorView(mivision);

    }
}