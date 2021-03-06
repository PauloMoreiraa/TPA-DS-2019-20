
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void logar(View view) {
        EditText edtLogin = (EditText) findViewById(R.id.login);
        String login = edtLogin.getText().toString();
        EditText edtSenha = (EditText) findViewById(R.id.senha);
        String senha = edtSenha.getText().toString();
        switch(login){
            case "ABC":
                switch (senha){
                    case "123":
                        double saldo = getIntent().getDoubleExtra("saldo", 0);
                        Intent intent = new Intent (this, saque.class);
                        intent.putExtra("saldo", saldo);
                        startActivity(intent);
                        break;
                    default:
                        Toast.makeText(this, "Usuário ou senha incorreto", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                Toast.makeText(this, "Usuário ou senha incorreto", Toast.LENGTH_SHORT).show();
        }
    }
    public void cancela(View view) {
        finish();
    }
}
