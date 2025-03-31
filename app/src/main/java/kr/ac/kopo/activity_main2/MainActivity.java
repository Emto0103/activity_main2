package kr.ac.kopo.activity_main2;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);

        text1.setTextSize(20);
        text1.setTextColor(Color.MAGENTA);
        text1.setText("한국폴리텍대학");

        text2.setTextSize(20);
        text2.setTextColor(Color.RED);
        text2.setText("인공지능소프트웨어과");

        text3.setTextColor(Color.MAGENTA);
        text3.setText("singleline속성singleline속성singleline속성singleline속성singleline속성singleline속성singleline속성singleline속성singleline속성singleline속성singleline속성singleline속성singleline속성singleline속성singleline속성");
        text3.setSingleLine();
    }
}