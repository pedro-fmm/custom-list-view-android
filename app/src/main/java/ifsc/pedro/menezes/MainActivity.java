package ifsc.pedro.menezes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Fruta MACA = new Fruta("Maça", "Avermelhada com traços verdes", R.drawable.maca, 2.99, 15151);
    Fruta MORANGO = new Fruta("Morango", "Avermelhada com traços verdes", R.drawable.morango, 5.99, 15152);
    Fruta LARANJA = new Fruta("Laranja", "Fruta em formato esferico com coloraçaão laranja", R.drawable.laranja, 1.99, 15154);
    Fruta ABACATE = new Fruta("Abacate", "Fruta em formato esferico com esverdiada", R.drawable.abacate, 7.99, 15155);
    Fruta MELANCIA = new Fruta("Melancia", "Fruta em formato esferico verde por fora e vermlho por dentro", R.drawable.melancia, 1.59, 15156);
    Fruta[] frutas = new Fruta[] {MACA, MORANGO, LARANJA, ABACATE, MELANCIA};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        ArrayAdapterFrutas myadapter = new ArrayAdapterFrutas(
                getApplicationContext(),
                R.layout.list,
                frutas
        );

        listView.setAdapter(myadapter);

    }
}