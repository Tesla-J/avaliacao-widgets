package ao.rafaelmarcos.avaliacaowidgets;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ChoiceActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    private Spinner mSpinner;
    private Button mChoiceButton;
    private int mPosition;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_choice);

        /*
        * Aqui comecei a me divertir e testar alguns limites.
        * O spinner apresentará opções de quais exemplos se
        * deseja ver, e ao ser pressionado o botão, o utilizador
        * será redirecionado para uma activity específica.
        */
        mChoiceButton = (Button) findViewById(R.id.choice_button);
        mSpinner = (Spinner) findViewById(R.id.spinner);

        /*
        * Aqui tem um exemplo de uma expressão lambda.
        * Essa é a forma simplificada de "(v) -> this.onClick(v)" sem aspas.
        *
        * Nota: se desconhece expressões lambda, olhe para MainActivity, lá tem um
        * exemplo mais amigável.
        */
        mChoiceButton.setOnClickListener(this::onClick);

        /*
        * Aqui cria-se um adapter para o spinner utilizando os dados de
        * um recurso, já que os dados serão estáticos.
        *
        * OBS: Essa forma é a mais recomendada, já que facilitará
        * alterações futuras e criação de versões diferentes para se
        * adequar a diferentes idiomas. E também por ser uma boa prática
        * e que obedece o design pattern MVC.
        */
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.widgets_array,
                android.R.layout.simple_spinner_item
        );
        // layout do dropdown do spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapter);
        mSpinner.setOnItemSelectedListener(this);
    }

    /*
    * Aqui se implementa a interface OnClickListener
    */
    @Override
    public void onClick(View v){
        Intent intent;
        switch(mPosition){
            case 0: intent = new Intent(this, ProvinciasActivity.class); break;
            case 1: intent = new Intent(this, ImageActivity.class); break;
            case 2: intent = new Intent(this, FormActivity.class); break;
            case 3: intent = new Intent(this, InfiniteLoadingActivity.class); break;
            default: intent = null;
        }

        if(intent != null) startActivity(intent);
    }

    /*
    * E aqui a interface OnItemSelected, utilizada pelo spinner
    */
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
        mPosition = pos;
        /*
        * E poderia simplesmente redirecionnar o utilizador para outra Activity
        * apenas pela ação de selecionar uma opção, mas não seria um comportamento natural,
        * então apenas obtenho a posição da opção escolhida e o método onclick fará
        * a cortezia de redirecionar o utilizador para a escolha selecionada.
        */
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent){
        return;
    }
}
