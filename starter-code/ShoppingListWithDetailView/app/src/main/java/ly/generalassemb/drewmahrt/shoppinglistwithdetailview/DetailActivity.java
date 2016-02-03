package ly.generalassemb.drewmahrt.shoppinglistwithdetailview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int id = getIntent().getIntExtra("id",-1);

        if (id >= 0){
            String [] description = ShoppingSQLiteOpenHelper.getmInstance(DetailActivity.this).getDescriptionById(id);


            TextView textView = (TextView) findViewById(R.id.name);
            textView.setText(description[0]);

            TextView textView2 = (TextView) findViewById(R.id.price);
            textView2.setText(description[1]);

            TextView textView3 = (TextView) findViewById(R.id.type);
            textView3.setText(description[2]);

            TextView textView4 = (TextView) findViewById(R.id.description);
            textView4.setText(description[3]);
        }
    }
}
