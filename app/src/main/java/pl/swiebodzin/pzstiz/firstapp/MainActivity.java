package pl.swiebodzin.pzstiz.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber;
    EditText lastNumber;
    TextView textSum;
    Button clearButton;
    Button sumButton;

    int a, b, sum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.firstNumber);
        lastNumber = findViewById(R.id.lastNumber);
        clearButton = findViewById(R.id.clearButton);
        sumButton = findViewById(R.id.sumButton);
        textSum = findViewById(R.id.textSum);

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a = Integer.parseInt(firstNumber.getText().toString());
                b = Integer.parseInt(lastNumber.getText().toString());
                //To samo co powyżej ale w dwóch linijkach.
                //String firstNumberString = firstNumber.getText().toString();
               // a = Integer.parseInt(firstNumberString);

                sum = getSum(a,b);
                textSum.setText(String.valueOf(sum));
            }
        });

    }

    public int getSum(int number1, int number2) {
        return number1 + number2;

    }
    public int getNumber(){
        //todo - uzupelnic metode.(pomaga zarządzać projektem)
        return 0;
    }

}