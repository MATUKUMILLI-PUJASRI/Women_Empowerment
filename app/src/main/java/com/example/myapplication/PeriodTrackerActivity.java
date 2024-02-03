package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class PeriodTrackerActivity extends AppCompatActivity {

    private ProgressBar progressBarCycleLength;
    private TextView textViewCycleLength;
    private CalendarView calendarViewPeriodDates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_period_tracker);

        progressBarCycleLength = findViewById(R.id.progressBarCycleLength);
        textViewCycleLength = findViewById(R.id.textViewCycleLength);
        calendarViewPeriodDates = findViewById(R.id.calendarViewPeriodDates);

        // Set progress and text for cycle length
        int cycleLength = 28; // Example cycle length (in days)
        progressBarCycleLength.setMax(cycleLength);
        progressBarCycleLength.setProgress(14); // Example initial progress for demonstration purposes
        textViewCycleLength.setText("Cycle Length: " + cycleLength + " days");

        // Set listener for calendar view
        calendarViewPeriodDates.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                // Handle selection of period dates
                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                // Example: Store the selected date in a variable or database
                Toast.makeText(PeriodTrackerActivity.this, "Selected Date: " + selectedDate, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
