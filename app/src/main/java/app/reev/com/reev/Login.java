package app.reev.com.reev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        getSupportActionBar().hide(); //hide the title bar
    }

    public void selecao(View view) {
        Intent intent = new Intent(this, Selecao.class);
        startActivity(intent);
    }
}
