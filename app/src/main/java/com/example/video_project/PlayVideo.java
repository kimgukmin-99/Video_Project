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
        String videoTitle = "";

        switch (tag) {
            case "1":
                uri = Uri.parse("android.resource://" + getPackageName() + "/raw/animal");
                videoTitle = "Puma";
                break;
            case "2":
                uri = Uri.parse("android.resource://" + getPackageName() + "/raw/dog");
                videoTitle = "Dog";
                break;

            case "3":
                uri = Uri.parse("android.resource://" + getPackageName() + "/raw/duck");
                videoTitle = "Duck";
                break;
            default:
                break;
        }
        title.setText(videoTitle);
        videoView.setVideoURI(uri);
        videoView.start();

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
    }

    public void returnMain(View v) {
        finish();
    }
}

