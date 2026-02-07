package suggestion;

import model.Meal;
import java.util.List;

public class DinnerSuggestion extends MealSuggestion {

    private List<String> dinnerItems = List.of(
        "Steak", "Salmon", "Stir-Fried Veggies", "Rice & Curry"
    );

    public DinnerSuggestion(Meal meal) {
        super(meal);
    }

    @Override
    public String suggestMealItem() {
        int index = (int)(Math.random() * dinnerItems.size());
        return dinnerItems.get(index);
    }
}
