package com.example.marketoff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddProduct extends AppCompatActivity {

    EditText name, price;
    Button addProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        name = findViewById(R.id.edt_add_name);
        price = findViewById(R.id.edt_add_price);
        addProduct = findViewById(R.id.btn_addMahsulot);

        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (name.getText().toString().equals("") && price.getText().toString().equals("")) {
                    Toast.makeText(AddProduct.this, "To'g'ri kiriting", Toast.LENGTH_SHORT).show();
                } else {

                    MainActivity.products.add(new Product(name.getText().toString(), price.getText().toString()));
                    finish();
                }
            }
        });
    }
}