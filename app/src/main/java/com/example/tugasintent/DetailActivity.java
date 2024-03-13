package com.example.tugasintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Mendapatkan intent yang dikirimkan dari MainActivity
        Intent intent = getIntent();

        // Mengambil objek Person dari intent
        Person person = (Person) intent.getSerializableExtra("person");

        // Mendapatkan TextView dari layout
        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView ageTextView = findViewById(R.id.ageTextView);
        TextView addressTextView = findViewById(R.id.addressTextView);

        // Menampilkan informasi orang tersebut di TextView
        if (person != null) {
            nameTextView.setText("Name: " + person.getName());
            ageTextView.setText("Age: " + person.getAge());
            addressTextView.setText("Address: " + person.getAddress());
        } else {
            // Jika data Person tidak ditemukan, tampilkan pesan kesalahan
            nameTextView.setText("Error: Person data not found");
        }
    }
}
