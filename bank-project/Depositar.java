

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Depositar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depositar);
    }
    public void confirma(View view) {
        EditText edtValor = (EditText) findViewById(R.id.depositar);
        double saldo = getIntent().getDoubleExtra("saldo", 0);
        saldo += Double.parseDouble(edtValor.getText().toString());
        Intent intent = new Intent(this, sucesso_deposito.class);
        intent.putExtra("saldo", saldo);
        startActivity(intent);
    }
    public void cancelar(View view) {
        Intent intent = new Intent(this, loginAdm.class);
        double saldo = getIntent().getDoubleExtra("saldo", 0);
        intent.putExtra("saldo", saldo);
        startActivity(intent);
    }
}
