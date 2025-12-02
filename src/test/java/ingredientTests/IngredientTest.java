package ingredientTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredientTest {

    Ingredient ingredient;

    @Test
    @DisplayName("Конструктор Ingredient корректно задаёт поля")
    void ingredientConstructorShouldSetFields() {
        ingredient = new Ingredient(IngredientType.SAUCE, "BBQ", 399.15f);

        assertEquals(IngredientType.SAUCE, ingredient.type);
        assertEquals("BBQ", ingredient.name);
        assertEquals(399.15f, ingredient.price);
    }

    @Test
    @DisplayName("ingredient.getName возвращает корректное имя")
    void getNameReturnsValues() {
        ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100f);
        assertEquals("hot sauce", ingredient.getName());
    }

    @Test
    @DisplayName("ingredient.getPrice возвращает корректную цену")
    void getPriceReturnsValues() {
        ingredient = new Ingredient(IngredientType.FILLING, "cutlet", 150.12589f);
        assertEquals(150.12589f, ingredient.getPrice());
    }

    @ParameterizedTest
    @EnumSource(IngredientType.class)
    @DisplayName("ingredient.getType возвращает корректный тип ингредиента")
    void getTypeReturnsValues(IngredientType type) {
        ingredient = new Ingredient(type, "name", 50f);
        assertEquals(type, ingredient.getType());
    }

}
