package ingredientTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import praktikum.IngredientType;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IngredientTypeTest {

    @Test
    @DisplayName("Возвращается правильный тип по имени")
    void ingredientTypeValueOfWorksCorrectly() {
        assertEquals(IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
        assertEquals(IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }

    @Test
    @DisplayName("Ошибка при неверном имени")
    void ingredientTypeValueOfThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> IngredientType.valueOf("WRONG"));
    }
}
