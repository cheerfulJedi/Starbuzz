package ua.kyselov.android.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Ivan on 3/28/2016.
 */
public class FoodCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        ListView listView = getListView();
        ArrayAdapter<Food> foodArrayAdapter = new ArrayAdapter<Food>(
                this,
                android.R.layout.simple_list_item_1,
                Food.foods
        );

        listView.setAdapter(foodArrayAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(FoodCategoryActivity.this,FoodActivity.class);
        intent.putExtra(FoodActivity.EXTRA_FOODO, (int)id);
        startActivity(intent);
    }
}
