package in.khofid.moviecatalogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] dataMovie = {"Captain Marvel", "Toy Story 4", "Dumbo", "Le chant du loup", "Escape Plan: The Extractors",
            "Aquaman", "How to Train Your Dragon: The Hidden World", "Murder Mystery", "Avengers: Endgame",
            "Avengers: Infinity War", "Game of Thrones", "Chernobyl", "A Star Is Born"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.lv_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, dataMovie);
        listView.setAdapter(adapter);
    }
}
