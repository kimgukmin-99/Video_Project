package com.example.video_project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayVideo extends AppCompatActivity {

    Uri uri;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_play);
        setTitle("동영상 재생");

        TextView title = (TextView) findViewById(R.id.title);
        VideoView videoView = (VideoView) findViewById(R.id.videoview);

        Intent it = getIntent();

        String tag = it.getStringExtra("data");

        switch (tag) {
            case "1":
                uri = Uri.parse("android.resource://" + getPackageName() + "/raw/animal");
                break;
            case "2":
                uri = Uri.parse("android.resource://" + getPackageName() + "/raw/dog");
                break;

            case "3":
                uri = Uri.parse("android.resource://" + getPackageName() + "/raw/duck");
                break;
            default:
                break;
        }
        videoView.setVideoURI(uri);
        videoView.start();

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
    }

    public void returnMain(View v) {
        finish();
    }
}

