package com.example.ken26.myplayvideo;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);

        getWindow().setFormat(PixelFormat.UNKNOWN);
        Intent intent = getIntent();

        Uri uri = Uri.parse(intent.getStringExtra("VideoFile"));
        VideoView mVideoPlay = (VideoView) findViewById(R.id.VideoView);
        MediaController mediaController = new MediaController(this);

        mVideoPlay.setVideoURI(uri);
        mVideoPlay.requestFocus();
        mVideoPlay.start();
        mVideoPlay.setMediaController(mediaController);


    }
}
