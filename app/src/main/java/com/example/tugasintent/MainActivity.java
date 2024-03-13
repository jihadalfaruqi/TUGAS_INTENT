
package com.example.tugasintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mendapatkan referensi ke tombol-tombol detail
        Button btnDetail1 = findViewById(R.id.btnDetail1);
        Button btnDetail2 = findViewById(R.id.btnDetail12);
        Button btnDetail3 = findViewById(R.id.btnDetail13);
        Button btnDetail4 = findViewById(R.id.btnDetail14);
        Button btnDetail5 = findViewById(R.id.btnDetail15);

        // Menambahkan onClickListener untuk setiap tombol detail
        btnDetail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat objek Person untuk item yang dipilih
                Person person = new Person("Andre", "30", "123 Main Street");

                // Navigasi ke DetailActivity dan kirim data person
                navigateToDetail(person);
            }
        });

        btnDetail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat objek Person untuk item yang dipilih
                Person person = new Person("belly", "25", "456 Elm Street");

                // Navigasi ke DetailActivity dan kirim data person
                navigateToDetail(person);
            }
        });

        btnDetail3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat objek Person untuk item yang dipilih
                Person person = new Person("carl", "23", "67 Main Street");

                // Navigasi ke DetailActivity dan kirim data person
                navigateToDetail(person);
            }
        });

        btnDetail4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat objek Person untuk item yang dipilih
                Person person = new Person("dyssa", "25", "98 Main Street");

                // Navigasi ke DetailActivity dan kirim data person
                navigateToDetail(person);
            }
        });

        btnDetail5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat objek Person untuk item yang dipilih
                Person person = new Person("eliza", "22", "88 Main Street");

                // Navigasi ke DetailActivity dan kirim data person
                navigateToDetail(person);
            }
        });





    }

    // Method untuk membuka DetailActivity dengan data person yang dipilih
    private void navigateToDetail(Person person) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("person", person);
        startActivity(intent);
    }
}
