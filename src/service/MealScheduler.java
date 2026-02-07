package service;

import model.Meal;
import java.util.ArrayList;
import java.util.List;

public class MealScheduler {

    private List<Meal> meals;

    public MealScheduler() {
        meals = new ArrayList<>();
        // Default meals
        meals.add(new Meal("BREAKFAST", "BKT", 5, 10));
        meals.add(new Meal("LUNCH", "LCH", 11, 15));
        meals.add(new Meal("DINNER", "DNR", 16, 21));
        meals.add(new Meal("SNACK", "SNK", 0, 4));
        meals.add(new Meal("SNACK", "SNK", 22, 23));
    }

    public void addCustomMeal(Meal meal) {
        meals.add(meal);
    }

    public Meal getMealByHour(int hour) {
        return switch (hour) {
            case 5,6,7,8,9,10 -> getMealByName("BREAKFAST");
            case 11,12,13,14,15 -> getMealByName("LUNCH");
            case 16,17,18,19,20,21 -> getMealByName("DINNER");
            default -> getMealByName("SNACK");
        };
    }

    private Meal getMealByName(String name) {
        return meals.stream()
                .filter(meal -> meal.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Meal not found"));
    }
}
