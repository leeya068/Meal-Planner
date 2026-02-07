package suggestion;

import model.Meal;
import java.util.List;

public class BreakfastSuggestion extends MealSuggestion {

    private List<String> breakfastItems = List.of(
        "Pancakes", "Omelette", "Cereal", "Smoothie"
    );

    public BreakfastSuggestion(Meal meal) {
        super(meal);
    }

    @Override
    public String suggestMealItem() {
        int index = (int)(Math.random() * breakfastItems.size());
        return breakfastItems.get(index);
    }
}
