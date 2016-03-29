package ua.kyselov.android.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ivan on 3/29/2016.
 */
public class FoodActivity extends Activity{

    public static final String EXTRA_FOODO = "foodActivity_extra_foodo";

    ImageView image;
    TextView name;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        image = (ImageView)findViewById(R.id.photoFood);
        name = (TextView)findViewById(R.id.nameFood);
        description = (TextView)findViewById(R.id.descriptionFood);

        int foodo = (Integer)getIntent().getExtras().get(EXTRA_FOODO);
        Food food = Food.foods[foodo];

        image.setImageResource(food.getImageResourceId());
        name.setText(food.getName());
        description.setText(food.getDescription());
    }
}
