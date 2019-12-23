package com.example.shopulse.Sellers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.shopulse.R;

public class SellersProductCategoryActivity extends AppCompatActivity
{

    private ImageView tShirt, sportsTShirts, kadinElbise, mont;
    private ImageView gozluk, sapka, canta, ayakkabi;
    private ImageView kulaklik, laptop, saat, telefon;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_product_category);




        tShirt = (ImageView) findViewById(R.id.t_shirt);
        sportsTShirts = (ImageView) findViewById(R.id.sports_t_shirt);
        kadinElbise = (ImageView) findViewById(R.id.kadın_elbise);
        mont = (ImageView) findViewById(R.id.mont);

        gozluk = (ImageView) findViewById(R.id.gozluk);
        sapka = (ImageView) findViewById(R.id.sapka);
        canta = (ImageView) findViewById(R.id.canta);
        ayakkabi = (ImageView) findViewById(R.id.ayakkabi);
        
        kulaklik = (ImageView) findViewById(R.id.kulaklik);
        laptop = (ImageView) findViewById(R.id.laptop);
        saat = (ImageView) findViewById(R.id.saat);
        telefon = (ImageView) findViewById(R.id.telefon);


        tShirt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SellersProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Araba");
                startActivity(intent);
            }
        });

        sportsTShirts.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SellersProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Elektronik");
                startActivity(intent);
            }
        });
        kadinElbise.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SellersProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Giyim&Aksesuar");
                startActivity(intent);
            }
        });
        mont.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SellersProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Motosiklet");
                startActivity(intent);
            }
        });
        gozluk.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SellersProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Kitap&Dergi");
                startActivity(intent);
            }
        });
        sapka.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SellersProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Bebek&Çocuk");
                startActivity(intent);
            }
        });
        canta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SellersProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Ev&Bahçe");
                startActivity(intent);
            }
        });
        ayakkabi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SellersProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Müzik&Plak");
                startActivity(intent);
            }
        });
        kulaklik.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SellersProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Ayakkabı&Çanta");
                startActivity(intent);
            }
        });
        laptop.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SellersProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Emlak");
                startActivity(intent);
            }
        });
        saat.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SellersProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Spor&Eğlence");
                startActivity(intent);
            }
        });
        telefon.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(SellersProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Kozmetik");
                startActivity(intent);
            }
        });
    }
}
