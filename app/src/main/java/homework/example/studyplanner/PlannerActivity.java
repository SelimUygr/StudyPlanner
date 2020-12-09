package homework.example.studyplanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class PlannerActivity extends AppCompatActivity {
    public static Double percentParameterPublic;
    public static List<Integer> sumListPublic = new ArrayList<>();
    public static List<String> namesListPublic = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_plan);
        Toast.makeText(PlannerActivity.this,"Please fill all information in order, otherwise program won't work properly",Toast.LENGTH_LONG).show();
        //Declaring all the edit text for lesson times per week
        final EditText studyTimePerWeek = (EditText) findViewById(R.id.studyTimeEditText);
        final EditText firstTime = (EditText) findViewById(R.id.lessonNameTimes);
        final EditText secondTime = (EditText) findViewById(R.id.lessonNameTwoTimes);
        final EditText thirdTime = (EditText) findViewById(R.id.lessonNameThreeTimes);
        final EditText fourthTime = (EditText) findViewById(R.id.lessonNameFourTimes);
        final EditText fifthTime = (EditText) findViewById(R.id.lessonNameFiveTimes);
        final EditText sixthTime = (EditText) findViewById(R.id.lessonNameSixTimes);
        final EditText seventhTime = (EditText) findViewById(R.id.lessonNameSevenTimes);
        final EditText eighthTime = (EditText) findViewById(R.id.lessonNameEightTimes);
        final EditText ninthTime = (EditText) findViewById(R.id.lessonNameNineTimes);
        final EditText tenthTime = (EditText) findViewById(R.id.lessonNameTenTimes);

        //Declaring all the edit text for lesson names
        final EditText first = (EditText) findViewById(R.id.lessonName);
        final EditText second = (EditText) findViewById(R.id.lessonNameTwo);
        final EditText third = (EditText) findViewById(R.id.lessonNameThree);
        final EditText fourth = (EditText) findViewById(R.id.lessonNameFour);
        final EditText fifth = (EditText) findViewById(R.id.lessonNameFive);
        final EditText sixth = (EditText) findViewById(R.id.lessonNameSix);
        final EditText seventh = (EditText) findViewById(R.id.lessonNameSeven);
        final EditText eighth = (EditText) findViewById(R.id.lessonNameEight);
        final EditText ninth = (EditText) findViewById(R.id.lessonNameNine);
        final EditText tenth = (EditText) findViewById(R.id.lessonNameTen);

        final Button create = (Button) findViewById(R.id.makePlan);
        final Button cancel = (Button) findViewById(R.id.cancelPlan);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Collect all the lesson times
                List<Integer> sumList = new ArrayList<>();
                if(!firstTime.getText().toString().equals("")) {
                    Integer firstLessonTime = Integer.parseInt(firstTime.getText().toString());
                    sumList.add(firstLessonTime);
                }
                if(!secondTime.getText().toString().equals("")) {
                    Integer secondLessonTime = Integer.parseInt(secondTime.getText().toString());
                    sumList.add(secondLessonTime);
                }
                if(!thirdTime.getText().toString().equals("")) {
                    Integer thirdLessonTime = Integer.parseInt(thirdTime.getText().toString());
                    sumList.add(thirdLessonTime);
                }
                if(!fourthTime.getText().toString().equals("")) {
                    Integer fourthLessonTime = Integer.parseInt(fourthTime.getText().toString());
                    sumList.add(fourthLessonTime);
                }
                if(!fifthTime.getText().toString().equals("")) {
                    Integer fifthLessonTime = Integer.parseInt(fifthTime.getText().toString());
                    sumList.add(fifthLessonTime);
                }
                if(!sixthTime.getText().toString().equals("")) {
                    Integer sixthLessonTime = Integer.parseInt(sixthTime.getText().toString());
                    sumList.add(sixthLessonTime);
                }
                if(!seventhTime.getText().toString().equals("")) {
                    Integer seventhLessonTime = Integer.parseInt(seventhTime.getText().toString());
                    sumList.add(seventhLessonTime);
                }
                if(!eighthTime.getText().toString().equals("")) {
                    Integer eighthLessonTime = Integer.parseInt(eighthTime.getText().toString());
                    sumList.add(eighthLessonTime);
                }
                if(!ninthTime.getText().toString().equals("")) {
                    Integer ninthLessonTime = Integer.parseInt(ninthTime.getText().toString());
                    sumList.add(ninthLessonTime);
                }
                if(!tenthTime.getText().toString().equals("")) {
                    Integer tenthLessonTime = Integer.parseInt(tenthTime.getText().toString());
                    sumList.add(tenthLessonTime);
                }

                Integer totalTimeLesson = 0;
                for (int i=0;i<sumList.size();i++){
                    totalTimeLesson += sumList.get(i);
                }
                Double percentParameter;
                percentParameter = Double.parseDouble(studyTimePerWeek.getText().toString()) / Double.valueOf(totalTimeLesson);
                percentParameterPublic = percentParameter;
                sumListPublic = sumList;


                List<String> namesList = new ArrayList<>();
                //Put all the lesson names to variable
                String firstLesson = first.getText().toString();
                String secondLesson = second.getText().toString();
                String thirdLesson = third.getText().toString();
                String fourthLesson = fourth.getText().toString();
                String fifthLesson = fifth.getText().toString();
                String sixthLesson = sixth.getText().toString();
                String seventhLesson = seventh.getText().toString();
                String eighthLesson = eighth.getText().toString();
                String ninthLesson = ninth.getText().toString();
                String tenthLesson = tenth.getText().toString();

                if(!firstLesson.equals("")) {
                    namesList.add(firstLesson);
                }
                if(!secondLesson.equals("")) {
                    namesList.add(secondLesson);
                }
                if(!thirdLesson.equals("")) {
                    namesList.add(thirdLesson);
                }
                if(!fourthLesson.equals("")) {
                    namesList.add(fourthLesson);
                }
                if(!fifthLesson.equals("")) {
                    namesList.add(fifthLesson);
                }
                if(!sixthLesson.equals("")) {
                    namesList.add(sixthLesson);
                }
                if(!seventhLesson.equals("")) {
                    namesList.add(seventhLesson);
                }
                if(!eighthLesson.equals("")) {
                    namesList.add(eighthLesson);
                }
                if(!ninthLesson.equals("")) {
                    namesList.add(ninthLesson);
                }
                if(!tenthLesson.equals("")) {
                    namesList.add(tenthLesson);
                }

                namesListPublic = namesList;

                Intent intentTwo = new Intent(PlannerActivity.this,Planned.class);
                startActivity(intentTwo);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
