import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class saque extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saque);
    }
    public void confirma(View view) {
        double saldo = getIntent().getDoubleExtra("saldo", 0);
        EditText edtSaque = (EditText) findViewById(R.id.valorsaque);
        double valorSaque = Double.parseDouble(edtSaque.getText().toString());

        if(valorSaque > saldo){
            Intent intent = new Intent(this, erroSaque.class);
            intent.putExtra("saldo", saldo);
            startActivity(intent);
        }else{
            saldo -= valorSaque;
            Intent intent = new Intent(this, sucesso.class);
            intent.putExtra("saldo", saldo);
            startActivity(intent);
        }
    }
    public void cancela(View view) {
        double saldo = getIntent().getDoubleExtra("saldo", 0);
        Intent intent = new Intent(this, Login.class);
        intent.putExtra("saldo", saldo);
        startActivity(intent);
    }
}
