package homework.example.studyplanner;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Planned extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan);
        //Times
        final TextView firstLessonNameTimePlanned = (TextView) findViewById(R.id.lessonNameTimesPlanned);
        final TextView secondLessonNameTimePlanned = (TextView) findViewById(R.id.lessonNameTwoTimesPlanned);
        final TextView thirdLessonNameTimePlanned = (TextView) findViewById(R.id.lessonNameThreeTimesPlanned);
        final TextView forthLessonNameTimePlanned = (TextView) findViewById(R.id.lessonNameFourTimesPlanned);
        final TextView fifthLessonNameTimePlanned = (TextView) findViewById(R.id.lessonNameFiveTimesPlanned);
        final TextView sixthLessonNameTimePlanned = (TextView) findViewById(R.id.lessonNameSixTimesPlanned);
        final TextView seventhLessonNameTimePlanned = (TextView) findViewById(R.id.lessonNameSevenTimesPlanned);
        final TextView eighthLessonNameTimePlanned = (TextView) findViewById(R.id.lessonNameEightTimesPlanned);
        final TextView ninthLessonNameTimePlanned = (TextView) findViewById(R.id.lessonNameNineTimesPlanned);
        final TextView tenthLessonNameTimePlanned = (TextView) findViewById(R.id.lessonNameTenTimesPlanned);

        //Names
        final TextView firstLessonNamePlanned = (TextView) findViewById(R.id.lessonNamePlanned);
        final TextView secondLessonNamePlanned = (TextView) findViewById(R.id.lessonNameTwo);
        final TextView thirdLessonNamePlanned = (TextView) findViewById(R.id.lessonNameThreePlanned);
        final TextView forthLessonNamePlanned = (TextView) findViewById(R.id.lessonNameFourPlanned);
        final TextView fifthLessonNamePlanned = (TextView) findViewById(R.id.lessonNameFivePlanned);
        final TextView sixthLessonNamePlanned = (TextView) findViewById(R.id.lessonNameSixPlanned);
        final TextView seventhLessonNamePlanned = (TextView) findViewById(R.id.lessonNameSevenPlanned);
        final TextView eighthLessonNamePlanned = (TextView) findViewById(R.id.lessonNameEightPlanned);
        final TextView ninthLessonNamePlanned = (TextView) findViewById(R.id.lessonNameNinePlanned);
        final TextView tenthLessonNamePlanned = (TextView) findViewById(R.id.lessonNameTenPlanned);


        if(PlannerActivity.namesListPublic.size() == 1){
            firstLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(0));
            firstLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(0)* PlannerActivity.percentParameterPublic)));
        }
        else if(PlannerActivity.namesListPublic.size() == 2){
            firstLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(0));
            firstLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(0)* PlannerActivity.percentParameterPublic)));
            secondLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(1));
            secondLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(1)* PlannerActivity.percentParameterPublic)));
        }
        else if(PlannerActivity.namesListPublic.size() == 3){
            firstLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(0));
            firstLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(0)* PlannerActivity.percentParameterPublic)));
            secondLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(1));
            secondLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(1)* PlannerActivity.percentParameterPublic)));
            thirdLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(2));
            thirdLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(2)* PlannerActivity.percentParameterPublic)));
        }
        else if(PlannerActivity.namesListPublic.size() == 4){
            firstLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(0));
            firstLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(0)* PlannerActivity.percentParameterPublic)));
            secondLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(1));
            secondLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(1)* PlannerActivity.percentParameterPublic)));
            thirdLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(2));
            thirdLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(2)* PlannerActivity.percentParameterPublic)));
            forthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(3));
            forthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(3)* PlannerActivity.percentParameterPublic)));
        }
        else if(PlannerActivity.namesListPublic.size() == 5){
            firstLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(0));
            firstLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(0)* PlannerActivity.percentParameterPublic)));
            secondLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(1));
            secondLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(1)* PlannerActivity.percentParameterPublic)));
            thirdLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(2));
            thirdLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(2)* PlannerActivity.percentParameterPublic)));
            forthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(3));
            forthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(3)* PlannerActivity.percentParameterPublic)));
            fifthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(4));
            fifthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(4)* PlannerActivity.percentParameterPublic)));
        }
        else if(PlannerActivity.namesListPublic.size() == 6){
            firstLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(0));
            firstLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(0)* PlannerActivity.percentParameterPublic)));
            secondLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(1));
            secondLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(1)* PlannerActivity.percentParameterPublic)));
            thirdLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(2));
            thirdLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(2)* PlannerActivity.percentParameterPublic)));
            forthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(3));
            forthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(3)* PlannerActivity.percentParameterPublic)));
            fifthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(4));
            fifthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(4)* PlannerActivity.percentParameterPublic)));
            sixthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(5));
            sixthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(5)* PlannerActivity.percentParameterPublic)));
        }
        else if(PlannerActivity.namesListPublic.size() == 7){
            firstLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(0));
            firstLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(0)* PlannerActivity.percentParameterPublic)));
            secondLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(1));
            secondLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(1)* PlannerActivity.percentParameterPublic)));
            thirdLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(2));
            thirdLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(2)* PlannerActivity.percentParameterPublic)));
            forthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(3));
            forthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(3)* PlannerActivity.percentParameterPublic)));
            fifthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(4));
            fifthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(4)* PlannerActivity.percentParameterPublic)));
            sixthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(5));
            sixthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(5)* PlannerActivity.percentParameterPublic)));
            seventhLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(6));
            seventhLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(6)* PlannerActivity.percentParameterPublic)));
        }
        else if(PlannerActivity.namesListPublic.size() == 8){
            firstLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(0));
            firstLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(0)* PlannerActivity.percentParameterPublic)));
            secondLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(1));
            secondLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(1)* PlannerActivity.percentParameterPublic)));
            thirdLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(2));
            thirdLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(2)* PlannerActivity.percentParameterPublic)));
            forthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(3));
            forthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(3)* PlannerActivity.percentParameterPublic)));
            fifthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(4));
            fifthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(4)* PlannerActivity.percentParameterPublic)));
            sixthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(5));
            sixthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(5)* PlannerActivity.percentParameterPublic)));
            seventhLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(6));
            seventhLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(6)* PlannerActivity.percentParameterPublic)));
            eighthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(7));
            eighthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(7)* PlannerActivity.percentParameterPublic)));
        }
        else if(PlannerActivity.namesListPublic.size() == 9){
            firstLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(0));
            firstLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(0)* PlannerActivity.percentParameterPublic)));
            secondLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(1));
            secondLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(1)* PlannerActivity.percentParameterPublic)));
            thirdLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(2));
            thirdLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(2)* PlannerActivity.percentParameterPublic)));
            forthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(3));
            forthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(3)* PlannerActivity.percentParameterPublic)));
            fifthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(4));
            fifthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(4)* PlannerActivity.percentParameterPublic)));
            sixthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(5));
            sixthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(5)* PlannerActivity.percentParameterPublic)));
            seventhLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(6));
            seventhLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(6)* PlannerActivity.percentParameterPublic)));
            eighthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(7));
            eighthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(7)* PlannerActivity.percentParameterPublic)));
            ninthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(8));
            ninthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(8)* PlannerActivity.percentParameterPublic)));
        }
        else if(PlannerActivity.namesListPublic.size() == 10){
            firstLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(0));
            firstLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(0) * PlannerActivity.percentParameterPublic)));
            secondLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(1));
            secondLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(1) * PlannerActivity.percentParameterPublic)));
            thirdLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(2));
            thirdLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(2) * PlannerActivity.percentParameterPublic)));
            forthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(3));
            forthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(3) * PlannerActivity.percentParameterPublic)));
            fifthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(4));
            fifthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(4) * PlannerActivity.percentParameterPublic)));
            sixthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(5));
            sixthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(5) * PlannerActivity.percentParameterPublic)));
            seventhLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(6));
            seventhLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(6) * PlannerActivity.percentParameterPublic)));
            eighthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(7));
            eighthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(7) * PlannerActivity.percentParameterPublic)));
            ninthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(8));
            ninthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(8) * PlannerActivity.percentParameterPublic)));
            tenthLessonNamePlanned.setText(PlannerActivity.namesListPublic.get(9));
            tenthLessonNameTimePlanned.setText(String.valueOf((int)Math.round(PlannerActivity.sumListPublic.get(9) * PlannerActivity.percentParameterPublic)));
        }
        else{
            Toast.makeText(Planned.this,"Somethings wrong! Please check the planner page!",Toast.LENGTH_LONG);
        }

    }
}
