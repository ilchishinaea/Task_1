package burgerTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testbase.BurgerTestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurgerIngredientsTest extends BurgerTestBase {

    @Test
    @DisplayName("Изменение булки корректно сохраняется")
    void setBunsAssignsBunCorrectly() {
        burger.setBuns(bun);
        assertEquals(bun, burger.bun);
    }

    @Test
    @DisplayName("Добавление ингредиентов увеличивает список")
    void addIngredientIncreasesList() {
        burger.addIngredient(ing1);
        burger.addIngredient(ing2);

        assertEquals(2, burger.ingredients.size());
    }

    @Test
    @DisplayName("Удаление ингредиента уменьшает список")
    void removeIngredientReducesList() {
        burger.addIngredient(ing1);
        burger.addIngredient(ing2);
        burger.removeIngredient(0);

        assertEquals(1, burger.ingredients.size());
        assertEquals(ing2, burger.ingredients.get(0));
    }

    @Test
    @DisplayName("Перемещение ингредиента меняет порядок")
    void moveIngredientChangesOrder() {
        burger.addIngredient(ing1);
        burger.addIngredient(ing2);
        burger.addIngredient(ing3);

        burger.moveIngredient(0, 2);

        assertEquals(ing2, burger.ingredients.get(0));
        assertEquals(ing3, burger.ingredients.get(1));
        assertEquals(ing1, burger.ingredients.get(2));
    }
}
