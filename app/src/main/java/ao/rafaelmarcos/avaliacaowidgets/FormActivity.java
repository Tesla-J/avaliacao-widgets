package ao.rafaelmarcos.avaliacaowidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        /*
        * Nenhum código para explicar aqui, mas basicamente eu
        * inventei uma espécio de formulário sem sentido apenas
        * para testar como posicionar diferentes elementos para
        * montar o layout. O experimento me deixou com a seguinte
        * dúvida: como posso manipular uma layout_constraint... para
        * alterar a distância entre os widgets? Já sei como manipular
        * o peso (weight) como no LinearLayout, mas ainda não testei se o
        * margin com valor negativo faz algum efeito.
        *
        * TODO testar a última frase acima
        *
        * Só não entendo a existência do AutoCompleteTextView se esta se
        * comporta como um EditText e essas funcionalidades de autocomplete
        * fariam mais sentido no EditText. Não pesquisei se o EditText também
        * permite autocomplete.
        */
    }
}