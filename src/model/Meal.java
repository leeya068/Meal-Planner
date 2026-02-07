package model;

public class Meal {
    private String name;
    private String abbreviation;
    private int startHour;
    private int endHour;

    public Meal(String name, String abbreviation, int startHour, int endHour) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public boolean isWithinHour(int hour) {
        return hour >= startHour && hour <= endHour;
    }

    public String getName(boolean abbreviated) {
        return abbreviated ? abbreviation : name;
    }

    // Getters
    public String getName() { return name; }
    public String getAbbreviation() { return abbreviation; }
    public int getStartHour() { return startHour; }
    public int getEndHour() { return endHour; }
}
