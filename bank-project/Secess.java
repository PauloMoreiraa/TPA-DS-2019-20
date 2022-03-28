import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class sucesso extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucesso);
        double saldo = getIntent().getDoubleExtra("saldo", 0);
        TextView txvSaldo = (TextView) findViewById(R.id.saldoatual);
        String saldoAtual = txvSaldo.getText().toString();
        txvSaldo.setText(saldoAtual+"R$"+saldo);
    }

    public void volta(View view) {
        double saldo = getIntent().getDoubleExtra("saldo", 0);
        Intent intent = new Intent(this, saque.class);
        intent.putExtra("saldo", saldo);
        startActivity(intent);
    }
    public void cancela(View view) {
        double saldo = getIntent().getDoubleExtra("saldo", 0);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("saldo", saldo);
        startActivity(intent);
    }
}
