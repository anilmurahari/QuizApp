package edu.niu.cs.z1759385.projectfinal;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Anil Vishwanath Murahari (z1759385)
 * Date: 5/9/16.
 * Project: CSCI 240 Quiz
 * Allows users to take quiz from random pool of question of each week and displays the results
 */

public class MainActivity extends Activity {
    //datamembers for spinner and string
    private Spinner quizSpin;
    private String selection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //connect spinner to screen
        quizSpin = (Spinner)findViewById(R.id.spinner);
        //initilise array adapter to select spinner items
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource( getApplicationContext(), R.array.quizlist,R.layout.spinner_xml );
        //set the spinner on screen with adapter
        quizSpin.setAdapter(adapter1);
        //when a item in spinner is checked
        quizSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //get the selected item
                selection = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    } //end of onCreate
    //when start quiz button is clicked
    //calling respective quiz pages and starting the intent
    public void startQuiz(View view)
    {
        if(selection.equals("Quiz 1")) {
            Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
            startActivity(intent);
        }
        if(selection.equals("Quiz 2")) {
            Intent intent = new Intent(getApplicationContext(), QuizActivity2.class);
            startActivity(intent);
        }
        if(selection.equals("Quiz 3")) {
            Intent intent = new Intent(getApplicationContext(), QuizActivity3.class);
            startActivity(intent);
        }
        if(selection.equals("Quiz 4")) {
            Intent intent = new Intent(getApplicationContext(), QuizActivity4.class);
            startActivity(intent);
        }
        if(selection.equals("Quiz 5")) {
            Intent intent = new Intent(getApplicationContext(), QuizActivity5.class);
            startActivity(intent);
        }
        if(selection.equals("Quiz 6")) {
            Intent intent = new Intent(getApplicationContext(), QuizActivity6.class);
            startActivity(intent);
        }
        if(selection.equals("Quiz 7")) {
            Intent intent = new Intent(getApplicationContext(), QuizActivity7.class);
            startActivity(intent);
        }
        if(selection.equals("Quiz 8")) {
            Intent intent = new Intent(getApplicationContext(), QuizActivity8.class);
            startActivity(intent);
        }
        if(selection.equals("Quiz 9")) {
            Intent intent = new Intent(getApplicationContext(), QuizActivity9.class);
            startActivity(intent);
        }
        if(selection.equals("Quiz 10")) {
            Intent intent = new Intent(getApplicationContext(), QuizActivity10.class);
            startActivity(intent);
        }
    }
}
