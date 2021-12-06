package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void testCreate() {
        Recipe recipe = new Recipe("Rakott krumpli");
        assertEquals(0, recipe.getIngredients().size());
        assertEquals("Rakott krumpli", recipe.getName());
        assertNull(recipe.getDescription());
    }

    @Test
    void testCreateWithDescription() {
        Recipe recipe = new Recipe("Rakott krumpli", "Héjában főtt krumplival!");
        assertEquals(0, recipe.getIngredients().size());
        assertEquals("Héjában főtt krumplival!", recipe.getDescription());
    }

    @Test
    void testAddIngredient() {
        Recipe recipe = new Recipe("Rakott krumpli", "Héjában főtt krumplival!");
        assertEquals(0, recipe.getIngredients().size());
        recipe.addIngredient("2kg krumpli", "12 tojás", "30dkg füstölt kolbás", "só", "400g tejföl",
                "150g sajt");
        assertEquals(6, recipe.getIngredients().size());
        assertEquals("2kg krumpli", recipe.getIngredients().get(0));
        assertEquals("só", recipe.getIngredients().get(3));
    }
}