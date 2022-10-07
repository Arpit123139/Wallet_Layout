package com.example.atry

import android.content.DialogInterface
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private lateinit var toolbar:Toolbar;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var toolbar = findViewById<Toolbar>(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);

        val builder = AlertDialog.Builder(this)

        val button=findViewById<Button>(R.id.money)
        button.setOnClickListener{


            val inflater = this.layoutInflater;
            val dialogView: View = inflater.inflate(R.layout.transfer_dialogbox, null)


            with(builder)
            {
                setView(dialogView)
                setTitle("Transfer Money")


                builder.setPositiveButton(
                    "Submit",
                    DialogInterface.OnClickListener { dialog, id ->

//                        val country = country.text.toString()
//                        val name = cityName.text.toString()
//
//                        if (country.isNotBlank() && name.isNotBlank()) {
//                            cityData.add(City(name, country))
//                            cityData.sortBy { it.name }
//                            saveCities()
//                        }

                    })
                val alert11: AlertDialog = builder.create()
                alert11.show()


            }

        }

        val add=findViewById<ImageView>(R.id.add);
        add.setOnClickListener{


            val inflater = this.layoutInflater;

            val dialogView: View = inflater.inflate(R.layout.add_dialog, null)


            with(builder)
            {

                setView(dialogView)
                setTitle("")



                builder.setPositiveButton(
                    "",
                    DialogInterface.OnClickListener { dialog, id ->

//                        val country = country.text.toString()
//                        val name = cityName.text.toString()
//
//                        if (country.isNotBlank() && name.isNotBlank()) {
//                            cityData.add(City(name, country))
//                            cityData.sortBy { it.name }
//                            saveCities()
//                        }

                    })
                val alert11: AlertDialog = builder.create()
                alert11.show()


            }

        }

        val bank=findViewById<ImageView>(R.id.bank);
        bank.setOnClickListener{


            val inflater = this.layoutInflater;

            val dialogView: View = inflater.inflate(R.layout.bank_dialog, null)


            with(builder)
            {

                setView(dialogView)
                setTitle("")



                builder.setPositiveButton(
                    "",
                    DialogInterface.OnClickListener { dialog, id ->

//                        val country = country.text.toString()
//                        val name = cityName.text.toString()
//
//                        if (country.isNotBlank() && name.isNotBlank()) {
//                            cityData.add(City(name, country))
//                            cityData.sortBy { it.name }
//                            saveCities()
//                        }

                    })
                val alert11: AlertDialog = builder.create()
                alert11.show()


            }

        }
        val gift=findViewById<ImageView>(R.id.gift);
        gift.setOnClickListener{


            val inflater = this.layoutInflater;

            val dialogView: View = inflater.inflate(R.layout.gift_dialog, null)


            with(builder)
            {

                setView(dialogView)
                setTitle("")



                builder.setPositiveButton(
                    "",
                    DialogInterface.OnClickListener { dialog, id ->

//                        val country = country.text.toString()
//                        val name = cityName.text.toString()
//
//                        if (country.isNotBlank() && name.isNotBlank()) {
//                            cityData.add(City(name, country))
//                            cityData.sortBy { it.name }
//                            saveCities()
//                        }

                    })
                val alert11: AlertDialog = builder.create()
                alert11.show()


            }

        }
    }
}