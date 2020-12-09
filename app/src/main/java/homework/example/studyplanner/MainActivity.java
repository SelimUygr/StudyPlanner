package homework.example.studyplanner;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String accountName = "admin";
    public static String password = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button loginButton = (Button) findViewById(R.id.loginButton);
        final EditText id = (EditText) findViewById(R.id.nameEditTextMain);
        final EditText pw = (EditText) findViewById(R.id.passwordEditTextMain);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = id.getText().toString();
                String passw = pw.getText().toString();
                if ((name.equals(accountName)) && (passw.equals(password))){
                    Intent intent = new Intent(MainActivity.this,PlannerActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"Account information is incorrect!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}