package ao.rafaelmarcos.avaliacaowidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import android.os.Bundle;

public class ProvinciasActivity extends AppCompatActivity {
    private AutoCompleteTextView mAutoComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provincias);

        mAutoComplete = (AutoCompleteTextView) findViewById(R.id.auto_complete);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.provincias_array,
                android.R.layout.simple_list_item_1);
        mAutoComplete.setAdapter(adapter);
    }
}