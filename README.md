MealPlanner is a Java application that determines the meal type based on the current hour. It allows users to see full or abbreviated meal names, add custom meal schedules, and optionally get meal suggestions. The project showcases **object-oriented programming (OOP)** concepts, **switch expressions**, and **modular, extendable design**.

## Features
- Determine meal type based on 24-hour time.
- Output can be full name (e.g., BREAKFAST) or abbreviated (e.g., BKT).
- Supports custom meal schedules.
- Optional meal suggestions (e.g., "Pancakes for breakfast").
- Input validation for hours (0–23).
- Extendable for future features (GUI, JSON schedule, etc.).

## OOP Concepts Used
- **Encapsulation**: Meal data is private with getters/setters.
- **Composition**: `MealScheduler` contains a list of `Meal` objects.
- **Inheritance & Polymorphism**: Optional meal suggestion subclasses.
- **Abstraction**: Interfaces for meal suggestion providers.
- **Single Responsibility Principle**: Separate classes for data, logic, and input.
- **Exception Handling**: Validates user input for hours.

## Classes
- `Meal`: Represents a meal type with name, abbreviation, and time range.
- `MealScheduler`: Holds meal types and determines the current meal.
- `UserInputHandler`: Handles user input and validation.
- `MealPlannerApp`: Main application class (CLI or GUI interface).
- `MealSuggestion`: Provides meal item suggestions.
