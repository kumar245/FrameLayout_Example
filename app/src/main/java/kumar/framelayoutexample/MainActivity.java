package kumar.framelayoutexample;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView i1,i2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=(ImageView)findViewById(R.id.imageView);
        i2=(ImageView)findViewById(R.id.imageView2);

        i1.setOnClickListener(this);
        i2.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.imageView){

            i1.setVisibility(View.INVISIBLE);
            i2.setVisibility(View.VISIBLE);

        }
        else {
            i2.setVisibility(View.GONE);
            i1.setVisibility(View.VISIBLE);
        }

    }
}
