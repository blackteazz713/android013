package com.example.imageviewimagearray;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    ImageView imageView;
    int[] img = {R.drawable.c1,R.drawable.c2,R.drawable.c3,
            R.drawable.c4,R.drawable.c5,R.drawable.c6,
            R.drawable.c7,R.drawable.c8,R.drawable.c9,
            R.drawable.c10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextTextPersonName);
        imageView = findViewById(R.id.image);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                sh();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    public void sh(){
        try {
            int num = Integer.parseInt(editText.getText().toString());
            imageView.setImageResource(img[num-1]);
        }
        catch (Exception e){
            Toast.makeText(this, "請輸入1~10其中一個數字", Toast.LENGTH_LONG).show();
        }
    }
}