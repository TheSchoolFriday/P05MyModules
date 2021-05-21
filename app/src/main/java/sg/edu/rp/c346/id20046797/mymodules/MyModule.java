package sg.edu.rp.c346.id20046797.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyModule extends AppCompatActivity {

    TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_module);

        tvView = findViewById(R.id.textViewAnswer);

        Intent intent = getIntent();

        String moduleCode = intent.getStringExtra("moduleCode");
        String moduleName = intent.getStringExtra("moduleName");
        String year = intent.getStringExtra("year");
        String semester = intent.getStringExtra("semester");
        String moduleCredit = intent.getStringExtra("moduleCredit");
        String venue = intent.getStringExtra("venue");

        tvView.setText(String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %s\nSemester: %s\nModule Credit: %s\nVenue: %s", moduleCode, moduleName, year, semester, moduleCredit, venue));
    }
}