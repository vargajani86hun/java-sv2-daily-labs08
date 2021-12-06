package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {
    private String name;
    private List<String> ingredients = new ArrayList<>();
    private String description;

    public Recipe(String name) {
        this.name = name;
    }
    public Recipe(String name, String description) {
        this(name);
        this.description = description;
    }

    public void addIngredient(String... ingredient) {
        ingredients.addAll(Arrays.asList(ingredient));
    }

    public String getDescription() {
        return description;
    }

    public List<String> getIngredients() {
        return new ArrayList<>(ingredients);
    }

    public String getName() {
        return name;
    }
}
