package ru.startandroid.p0101listener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // найдём View-элементы
        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);

        // создание обработчика
        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // по id определяем кнопку, вызываюшую этот обработчик
                switch (view.getId()) {
                    case R.id.btnOk:
                        // кнопка OK
                        tvOut.setText("Нажата кнопка OK");
                        break;
                    case R.id.btnCancel:
                        // кнопка cancel
                        tvOut.setText("Нажата кнопка Cancel");
                        break;

                }
            }
        };

        btnOk.setOnClickListener(oclBtn);
        btnCancel.setOnClickListener(oclBtn);
    }
}
