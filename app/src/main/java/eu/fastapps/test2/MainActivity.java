package eu.fastapps.test2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    Button button1;
    Button button2;
    Button button3;

    boolean darkMode = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        UiModeManager uiManager = (UiModeManager) getSystemService(Context.UI_MODE_SERVICE);
        Log.i("MainActivity", "onCreate uiManager.getNightMode() = " + uiManager.getNightMode());


        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(
                (b) -> OnButton1Clicked()
        );

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(
                (b) -> OnButton2Clicked()
        );

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(
                (b) -> OnButton3Clicked()
        );

        textView = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
    }

    void OnButton1Clicked(){

        Person person1 = new Person("Cosmin", "Oprescu");
        textView.setText(person1.print());


        Person student1 = new Student("Cosmin", "Oprescu", 10.0f);
        textView2.setText(student1.print());

    }

    void OnButton2Clicked(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }

    void OnButton3Clicked(){
        Intent intent = new Intent(this, FeaturesActivity.class);
        startActivity(intent);
    }

}