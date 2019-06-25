package in.khofid.moviecatalogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_DATA = "extra_data";

    TextView txtTitle, txtDescription;
    ImageView imgPoster;
    Movie movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtTitle = findViewById(R.id.txt_title);
        txtDescription = findViewById(R.id.txt_description);
        imgPoster = findViewById(R.id.img_poster);

        movie = getIntent().getParcelableExtra(EXTRA_DATA);
        txtTitle.setText(movie.getTitle());
        txtDescription.setText(movie.getDescription());

        Glide.with(this)
                .load(movie.getPoster())
                .apply(new RequestOptions().override(200, 300))
                .into(imgPoster);
    }
}
