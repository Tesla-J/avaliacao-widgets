package ao.rafaelmarcos.avaliacaowidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class InfiniteLoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infinite_loading);

        /*
        * Antes de mais nada, admito que eu fiz essa activity para
        * trollar, mas indo para oque importa:
        *
        * Não utilizei o ProgressDialog porque na documentação diz
        * que ela está obsoleta porque não permite a interação com
        * a app enquando ela está visível. Por isso optei por algo
        * actualizado e que será mais útil ter conhecimendo.
        *
        * Nota: eu utilizei o ProgressBar para progressos indeterminados,
        * apenas para fins ilustrativos.
        *
        * //TODO determined progress counter with user input.
        * //TODO TaskCheduling and Multithread counter (1 per second)
        * //TODO use a service to manage the progressBar
        */
    }
}