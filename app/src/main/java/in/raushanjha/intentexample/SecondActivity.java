package in.raushanjha.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    String email,password;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        email=getIntent().getStringExtra("email");
        password=getIntent().getStringExtra("password");
        name=findViewById(R.id.username);

        name.setText(email);


    }
}
