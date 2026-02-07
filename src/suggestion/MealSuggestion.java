package suggestion;

import model.Meal;

public abstract class MealSuggestion {
    protected Meal meal;

    public MealSuggestion(Meal meal) {
        this.meal = meal;
    }

    public abstract String suggestMealItem();
}
