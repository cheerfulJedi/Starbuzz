package ua.kyselov.android.starbuzz;

/**
 * Created by Ivan on 3/28/2016.
 */
public class Food {

    private String name;
    private String description;
    int imageResourceId;

    public Food(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public static final Food[] foods =  new Food[] { new Food(
        "Stake", "A steak is a meat generally sliced perpendicular to the muscle fibers, potentially including a bone", R.drawable.stake),
            new Food(
            "Hamburger","A hamburger is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun.",
            R.drawable.burger)
    };

    @Override
    public String toString(){
        return this.name;
    }
}
