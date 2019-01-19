package app.reev.com.reev;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AlphabetIndexer;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText email;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        getSupportActionBar().hide(); //hide the title bar

    }

    public void selecao(View view) {
        EditText ema = findViewById(R.id.txtEmail);
        EditText sen = findViewById(R.id.txtPass);

        if(ema.getText().toString().equals("123") && sen.getText().toString().equals("123")) {
            int eml = 123;


            if (eml == 123) {
                Intent intent = new Intent(this, Selecao.class);
                startActivity(intent);
            }
        }
        else if (sen.getText().toString().equals("") ){
            Toast.makeText(Login.this, "Insira a senha", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(Login.this, "Insira o e-mail", Toast.LENGTH_SHORT).show();
        }

    }
}
