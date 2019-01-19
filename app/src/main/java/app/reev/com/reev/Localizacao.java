package app.reev.com.reev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Localizacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacao);
        getSupportActionBar().hide(); //hide the title bar

    }

    public void selecionarLoc(View view) {
       Intent intent = new Intent(this, selecionarLocalizaca.class);
        startActivity(intent);
    }
}
