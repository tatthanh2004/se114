package com.example.bt2;
//import com.example.bt2.Storage;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private TextView tvName, tvDescription;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvName = findViewById(R.id.tv_name);
        tvDescription = findViewById(R.id.tv_description);
        btnLogout = findViewById(R.id.btn_logout);

        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");

        tvName.setText(Storage.getName(this));
        tvDescription.setText(Storage.getDescription(this));

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}