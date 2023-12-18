package ao.rafaelmarcos.avaliacaowidgets;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * Podemos determinar o comportamento de um botão quando ele é clicado
        * adicionando como parâmetro no método setOnClickListener um objeto de
        * uma classe que implementa a interface View.OnClickListener, uma classe
        * anônima ou uma expressão lambda. Optei pela primeira alternativa para
        * facilitar o entendimento de quem desconhece os dois últimos conceitos.
        */
        mTextView = (TextView) findViewById(R.id.text_view);
        mTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, ChoiceActivity.class);
        startActivity(intent);
    }
}