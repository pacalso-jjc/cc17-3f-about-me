package com.example.cc17_3f_aboutme

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cc17_3f_aboutme.adapter.AboutMeAdapter
import com.example.cc17_3f_aboutme.model.AboutMe

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvAboutMe: RecyclerView = findViewById(R.id.rvAboutMe)
        rvAboutMe.layoutManager = LinearLayoutManager(this)

        val aboutMe1 = AboutMe(R.mipmap.ic_launcher,
            "Jerry Junior Pacalso",
            "Short Desc",
            { view ->
                val intent = Intent(this, AboutJerryActivity::class.java)
                startActivity(intent)
            } )

        val aboutMe2 = AboutMe(R.drawable.jane_doe_dp,
            "Jane Doe",
            "ZZZ",
            {view ->
                val intent = Intent(this, AboutJaneDoeActivity::class.java)
                startActivity(intent)
            })

        val johnSmith = AboutMe(R.drawable.john_smith_dp,
            "John Smith",
            "Explorer",
            { view ->
                val intent = Intent(this, AboutJohnSmithActivity::class.java)
                startActivity(intent)
            })
        val isaac = AboutMe(R.drawable.images,
            "Isaac Garcia",
            "Small but Really small",
            { view ->
                val intent = Intent(this, AboutIsaacActivity::class.java)
                startActivity(intent)
            })

        val paul = AboutMe(R.drawable.izme,
            "Paul Valera",
            "Painfully Average",
            {/*TODO add onclicklistener when show more button is clicked*/})


        val jLumague = AboutMe(R.drawable.nikka_dp,
            "Jeanikka Merjoy Lumague",
            "Artistic",
            { view ->
                val intent = Intent(this, AboutNikkaActivity::class.java)
                startActivity(intent)
            })

        val siachongco = AboutMe(R.drawable.arabella_dp,
            "Arabella Siachongco",
            "Creative",

            { view ->
                val intent = Intent(this, AboutSiachongcoActivity::class.java)
                startActivity(intent)
            })

        val jBravo = AboutMe(R.drawable.jhara_dp,
            "Jharawell Rus Bravo",
            "Traveler",

            {

            })

        val secolles = AboutMe(R.drawable.secolles_dp,
            "Vanessa Secolles",
            "Occasional Mermaid",

            { view ->
                val intent = Intent(this, AboutSecollesActivity::class.java)
                startActivity(intent)
            })

        val PastorKJ = AboutMe(R.drawable.kyra_wip060_1,
            "Kyra Joey Pastor",
            "Artist",
         { view ->
            val intent = Intent(this, AboutKyraActivity::class.java)
            startActivity(intent)
         })

        val ramos = AboutMe(R.drawable.ken_selfie,
            "Kenneth Joshua Ramos",
            "Goddess of Beauty",
            { view ->
            val intent = Intent(this, AboutKennethActivity::class.java)
            startActivity(intent)})

        val payumo = AboutMe(R.drawable.kebin_dawk,
            "Kevin Payumo",
            "Autistic",
            { view ->
                val intent = Intent(this, AboutKevinActivity::class.java)
                startActivity(intent)
            } )

        val garduque = AboutMe(R.drawable.rib,
            "Riv Andrei Garduque",
            "REEEEEEEEEEEE",
            { view ->
                val intent = Intent(this, AboutRivActivity::class.java)
                startActivity(intent)
            })

        val ailaNieva = AboutMe(R.drawable.aila_nieva_dp,
            "Aila Marie Nieva",
            "Chill",
            {/*TODO*/
            })

        val sobrepenatid = AboutMe(R.drawable.sobrepenatid,
            "Trina Ilyza Sobrepeña",
            "Hot Dancer",
            { /*view ->
            val intent = Intent(this, AboutTrinaActivity::class.java)
            startActivity((intent)*/})

        val simonKao = AboutMe(R.drawable.kaokao,
            "Simon Adrian Aquino",
            "Pight Me",
            { /*TODO*/})


        val arrList = listOf(aboutMe1, aboutMe2, johnSmith, isaac, jLumague, siachongco, jBravo, secolles, PastorKJ, ramos, payumo, garduque, ailaNieva, sobrepenatid, simonKao)


        rvAboutMe.adapter = AboutMeAdapter(arrList)
    }
}