package sg.edu.rp.c346.id20046797.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvView;
    Button btnReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moduledetailactivity);

        tvView = findViewById(R.id.textViewAnswer);
        btnReturn = findViewById(R.id.buttonReturn);

        Intent intent = getIntent();

        String moduleCode = intent.getStringExtra("moduleCode");
        String moduleName = intent.getStringExtra("moduleName");
        String year = intent.getStringExtra("year");
        String semester = intent.getStringExtra("semester");
        String moduleCredit = intent.getStringExtra("moduleCredit");
        String venue = intent.getStringExtra("venue");

        tvView.setText(String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %s\nSemester: %s\nModule Credit: %s\nVenue: %s",
                moduleCode, moduleName, year, semester, moduleCredit, venue));

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}