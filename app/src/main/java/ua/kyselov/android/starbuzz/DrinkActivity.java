package ua.kyselov.android.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ivan on 3/28/2016.
 */
public class DrinkActivity extends Activity {
    public static final String EXTRA_DRINKO = "drink_activity_extra_drinkoo_";

    ImageView image;
    TextView name;
    TextView description;

    @Override
    protected void onCreate(Bundle onSavedInstanceState){
        super.onCreate(onSavedInstanceState);
        setContentView(R.layout.activity_drink);
        ImageView image = (ImageView)findViewById(R.id.photo);
        TextView name = (TextView)findViewById(R.id.name);
        TextView description = (TextView)findViewById(R.id.description);


        int drinko = (Integer)getIntent().getExtras().get(EXTRA_DRINKO);
        Drink drink = Drink.drinks[drinko];

        image.setImageResource(drink.getImageResourceId());
        name.setText(drink.getName());
        description.setText(drink.getDescription());
    }
}
