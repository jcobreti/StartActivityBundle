package android.edu.startactivitybundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView texto;
    private String valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto=findViewById(R.id.texto);
        valor=texto.getText().toString();
    }

    public void irActivity2(View view)
    {
        Intent intent=new Intent(this, Actividad2.class);
        intent.putExtra("CLAVE",valor);
        startActivity(intent);
    }
}
