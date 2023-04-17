package com.example.video_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("비디오 앨범");
    }

    public void showVideo(View view){
        int id = view.getId();
        String tag;

        switch (id){
            case R.id.video1:
                tag = "1";
                break;
            case R.id.video2:
                tag = "2";
                break;
            case R.id.video3:
                tag = "3";
                break;
            default:
                tag = "0";
        }
        Intent intent = new Intent(this, PlayVideo.class);
        intent.putExtra("data", tag);

        startActivity(intent);
    }
}