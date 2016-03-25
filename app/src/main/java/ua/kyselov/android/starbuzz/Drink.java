package ua.kyselov.android.starbuzz;

/**
 * Created by Ivan on 3/25/2016.
 */
public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public Drink(String name, String description, int imageResource){
        this.name = name;
        this.imageResourceId = imageResource;
        this.description = description;
    }

    public static final Drink[] drinks = {
        new Drink("Latte", "A couple of espresso shots with steamed link", R.drawable.latte),
        new Drink("Cappucino","Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
        new Drink("Filter","Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
