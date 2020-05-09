package id.co.myproject.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class MainActivity extends AppCompatActivity {

    private Button btnVolume;
    private EditText etSisi, etTinggi;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVolume = findViewById(R.id.btn_volume);
        etSisi = findViewById(R.id.et_sisi);
        etTinggi = findViewById(R.id.et_tinggi);
        tvHasil = findViewById(R.id.tv_hasil);

        btnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double hasil, sisi, tinggi;
                sisi = Double.parseDouble(etSisi.getText().toString());
                tinggi = Double.parseDouble(etTinggi.getText().toString());
                hasil = 0.333*sisi*tinggi;
                tvHasil.setText(String.valueOf(hasil)+ "cm(3)");
            }
        });

    }

}
