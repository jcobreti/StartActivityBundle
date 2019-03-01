package android.edu.startactivitybundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {
    private String valor;
    private  TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        Bundle bolsa=getIntent().getExtras();
        tv=findViewById(R.id.textoFinal);
        valor=bolsa.getString("CLAVE");
        if (valor==null)
            valor="ERROR EN LA RECEPCION DEL STRING";
        tv.setText(valor);
    }
}
