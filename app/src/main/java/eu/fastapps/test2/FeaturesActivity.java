package eu.fastapps.test2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class FeaturesActivity extends AppCompatActivity {

    Button btnDarkMode;
    Button btnYT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_features);

        btnDarkMode = findViewById(R.id.btn_dark_mode);
        btnDarkMode.setOnClickListener(
                (b)-> onToggleDarkMode()
        );

        btnYT = findViewById(R.id.btn_youtube);
        btnYT.setOnClickListener(
                (b)-> onYoutubeLink()
        );

    }

    private void onYoutubeLink(){
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=" + "saEpkcVi1d4"));
        startActivity(webIntent);
    }


    private void onToggleDarkMode() {
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
        else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
    }


}