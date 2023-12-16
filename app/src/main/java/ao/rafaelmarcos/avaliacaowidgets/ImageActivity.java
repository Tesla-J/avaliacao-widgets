package ao.rafaelmarcos.avaliacaowidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class ImageActivity extends AppCompatActivity {
    private ImageButton mImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        mImageButton = (ImageButton) findViewById(R.id.image_button);
        mImageButton.setOnClickListener((v) -> Toast.makeText(this, "Este é um ImageButton", Toast.LENGTH_SHORT).show());
    }
}