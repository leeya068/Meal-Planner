import service.MealScheduler;
import util.UserInputHandler;
import model.Meal;
import suggestion.*;

public class MealPlannerApp {
    public static void main(String[] args) {
        MealScheduler scheduler = new MealScheduler();
        UserInputHandler inputHandler = new UserInputHandler();

        System.out.println("=== Welcome to MealPlanner ===");

        int hour = inputHandler.getHourFromUser();
        boolean abbreviated = inputHandler.askAbbreviation();

        Meal currentMeal = scheduler.getMealByHour(hour);
        System.out.println("Current meal: " + currentMeal.getName(abbreviated));

        // Provide meal suggestion
        MealSuggestion suggestion = switch (currentMeal.getName(false)) {
            case "BREAKFAST" -> new BreakfastSuggestion(currentMeal);
            case "LUNCH" -> new LunchSuggestion(currentMeal);
            case "DINNER" -> new DinnerSuggestion(currentMeal);
            default -> null;
        };

        if (suggestion != null) {
            System.out.println("Suggested item: " + suggestion.suggestMealItem());
        } else {
            System.out.println("No specific suggestion for snacks!");
        }
    }
}
