import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logaCliente (View view) {
        double saldo = getIntent().getDoubleExtra("saldo", 0);
        Intent intent = new Intent(this, Login.class);
        intent.putExtra("saldo", saldo);
        startActivity(intent);
    }

    public void logaAdm (View view) {
        double saldo = getIntent().getDoubleExtra("saldo", 0);
        Intent intent = new Intent(this, loginAdm.class);
        intent.putExtra("saldo", saldo);
        startActivity(intent);
    }
}
