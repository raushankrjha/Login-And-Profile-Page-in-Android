package in.raushanjha.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText email,password;
    String getemail,getpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.click);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                getemail=email.getText().toString();
                getpassword=password.getText().toString();
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);

                intent.putExtra("email",getemail);
                intent.putExtra("password",getpassword);

                startActivity(intent);
            }
        });
    }
}
