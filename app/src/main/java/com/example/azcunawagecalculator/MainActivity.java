import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextHourlyWage;
    private EditText editTextHoursWorked;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextHourlyWage = findViewById(R.id.editTextHourlyWage);
        editTextHoursWorked = findViewById(R.id.editTextHoursWorked);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);


        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateWage();
            }
        });
    }

    private void calculateWage() {

        String wageString = editTextHourlyWage.getText().toString();
        String hoursString = editTextHoursWorked.getText().toString();


        double hourlyWage = Double.parseDouble(wageString);
        double hoursWorked = Double.parseDouble(hoursString);


        double totalWage = hourlyWage * hoursWorked;


        textViewResult.setText("Total Wage: $" + totalWage);
    }
}