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

        mTextView = (TextView) findViewById(R.id.text_view);
        mTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, ChoiceActivity.class);
        startActivity(intent);
    }
}