package kr.ac.kopo.activity_main2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    TextView textResult;
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

        EditText edit1 = findViewById(R.id.edit1);
        TextView textResult = findViewById(R.id.textResult);
        Button btnResult = findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String univName = edit1.getText().toString();
                String result = univName + "에 합격하신 것을 진심으로 축하드립니다.";
                textResult.setText(result);
                textResult.setTextColor(Color.rgb(128,65,217));
            }
        });
    }
}