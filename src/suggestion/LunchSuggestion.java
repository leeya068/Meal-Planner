package suggestion;

import model.Meal;
import java.util.List;

public class LunchSuggestion extends MealSuggestion {

    private List<String> lunchItems = List.of(
        "Grilled Chicken", "Pasta", "Salad", "Sandwich"
    );

    public LunchSuggestion(Meal meal) {
        super(meal);
    }

    @Override
    public String suggestMealItem() {
        int index = (int)(Math.random() * lunchItems.size());
        return lunchItems.get(index);
    }
}
