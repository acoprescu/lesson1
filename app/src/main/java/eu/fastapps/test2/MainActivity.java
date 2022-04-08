package eu.fastapps.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(
                (b) -> OnButton1Clicked()
        );

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(
                (b) -> OnButton2Clicked()
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

}