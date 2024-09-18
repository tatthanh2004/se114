package com.example.bt2;
import com.example.bt2.Storage;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StorageActivity extends AppCompatActivity {
    private EditText etName, etDescription;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);

        etName = findViewById(R.id.et_name);
        etDescription = findViewById(R.id.et_description);
        btnSave = findViewById(R.id.btn_save);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String description = etDescription.getText().toString();

                Storage.saveData(StorageActivity.this, name, description);

                Toast.makeText(StorageActivity.this, "Thông tin đã được lưu trữ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}