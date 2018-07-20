package gulov.khurshed.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Указывает файл макета с виджетами
        setContentView(R.layout.activity_main);

        // Находит нужный TextView по id
        // (в данном случае FirstText) и присваивает переменной
        TextView tv = findViewById(R.id.firstText);
        // Устанавливает значение свойства text на "First TextView text"
        tv.setText("First TextView text");

        TextView tv2 = findViewById(R.id.blueText);
        tv2.setText("Blue TextView text");

        TextView sumTv = findViewById(R.id.sumTxt);
        // Задаёт новое значение свойству text равную
        // сумме цифр 10+15, которую возвращает функция sum(int,int)
        sumTv.setText(sum(10,15));
    }
    // Функция для расчёта суммы двух переданных цифр
    int sum(int a, int b)
    {
        // Переданные в строке 25 значения теперь присвоены по порядку
        // переменным a и b: a=10, b=15
        return a+b;
    }
}
