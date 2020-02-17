package be.ehb.demo_fragments_tabbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import be.ehb.demo_fragments_tabbar.util.TabPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //verwijzing naar toolbar
            //kies voor de tweede optie toolbar die aangevuld wordt (met x) deze ondersteund de oudere ook
            Toolbar toolbar = findViewById(R.id.toolbar);
            //voor vroegere vroeger was toolbar actionbar en om te zorgen dat nieuw en out werkt volgende lijn toevoegen
            setSupportActionBar(toolbar);

            TabLayout tabLayout = findViewById(R.id.tab_layout);
            //meerdere keuzes altijd gaan voor androidx
            ViewPager viewPager = findViewById(R.id.frag_container);

        //omschrijving hoe alles opgevuld moet worden
        TabPagerAdapter adapter = new TabPagerAdapter(getSupportFragmentManager(), 0);

        //alles aan elkaar koppelen
        //alles instellen
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
