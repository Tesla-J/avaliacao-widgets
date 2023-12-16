package ao.rafaelmarcos.avaliacaowidgets;

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

        mChoiceButton = (Button) findViewById(R.id.choice_button);
        mSpinner = (Spinner) findViewById(R.id.spinner);

        mChoiceButton.setOnClickListener(this::onClick);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.widgets_array,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapter);
        mSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onClick(View v){
        Toast.makeText(this, "" + mPosition, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
        mPosition = pos;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent){
        return;
    }
}
