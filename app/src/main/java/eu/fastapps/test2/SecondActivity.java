package eu.fastapps.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textHello;
    TextView textWorld;
    TextView textCat;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        textHello = findViewById(R.id.textHello);
        textWorld = findViewById(R.id.textWorld);
        textCat = findViewById(R.id.textCat);

        button = findViewById(R.id.button2);

        button.setOnClickListener(
                (v) -> {
                    buttonClicked();
                }
        );
    }

    void buttonClicked(){
        String text1 = textHello.getText().toString();
        String text2 = textWorld.getText().toString();

        textCat.setText(text1 + " " + text2);


    }
}