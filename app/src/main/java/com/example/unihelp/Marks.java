package com.example.unihelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Marks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);
    }

    public void goToNoteCreator(View view){
        Intent intent = new Intent(this, NoteCreator.class);
        startActivity(intent);
    }
}