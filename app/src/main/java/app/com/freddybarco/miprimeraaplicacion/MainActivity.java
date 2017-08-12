package app.com.freddybarco.miprimeraaplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText entrada;
    private Button btn;
    private String recuperado;
    private Intent nuevo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrada = (EditText)findViewById(R.id.input);
        btn = (Button) findViewById(R.id.btn);




        btn.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        nuevo = new Intent(this,Main2Activity.class);
        startActivity(nuevo);
    }
}
