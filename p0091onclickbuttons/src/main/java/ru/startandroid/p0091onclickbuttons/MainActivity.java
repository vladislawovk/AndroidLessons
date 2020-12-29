package ru.startandroid.p0091onclickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //найдём View-элементы
        final TextView tvOut = findViewById(R.id.tvOut);
        Button btnOk = findViewById(R.id.btnOk);
        Button btnCancel = findViewById(R.id.btnCancel);

        //Создаём обработчик нажатия кнопки OK
        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Менияем текст в TextView (tvOut)
                tvOut.setText("Нажата кнопка Ок");
            }
        };
        //Присвоим обработчик кнопке OK (btnOK)
        btnOk.setOnClickListener(oclBtnOk);

        //Создаём обработчик нажатия кнопки Cancel
        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Менияем текст в TextView (tvOut)
                tvOut.setText("Нажата кнопка Cancel");
            }
        };

        //Присвоим обработчик кнопке Cancel (btnCancel)
        btnCancel.setOnClickListener(oclBtnCancel);
    }
}
