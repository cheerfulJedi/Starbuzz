package ua.kyselov.android.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Ivan on 3/25/2016.
 */
public class DrinkCategoryActiity extends ListActivity {

    @Override
    protected void onCreate(Bundle savaedInastanceState){
        super.onCreate(savaedInastanceState);

        ListView listDrinks = getListView();
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(
                this,
                android.R.layout.simple_list_item_1,
                Drink.drinks
        );

        listDrinks.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(DrinkCategoryActiity.this, DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKO, (int) id);
        startActivity(intent);
    }
}
