package sg.edu.rp.c346.id20046797.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOne, tvTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOne = findViewById(R.id.textViewFirstMOD);
        tvTwo = findViewById(R.id.textViewSecondMOD);

        tvOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleCode", "C346");
                intent.putExtra("moduleName", "Android Programming");
                intent.putExtra("year","2020");
                intent.putExtra("semester", "1");
                intent.putExtra("moduleCredit", "4");
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }
        });

        tvTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleCode", "C349");
                intent.putExtra("moduleName", "iPad Programming");
                intent.putExtra("year","2020");
                intent.putExtra("semester", "1");
                intent.putExtra("moduleCredit", "4");
                intent.putExtra("venue", "E24E");
                startActivity(intent);
            }
        });
    }
}