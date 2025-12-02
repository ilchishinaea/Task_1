package burgerTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testbase.BurgerTestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurgerPriceTest extends BurgerTestBase {

    @Test
    @DisplayName("Корректный расчет цены с булкой и ингириентами")
    void getPriceReturnsCorrectValue() {
        burger.setBuns(bun);
        burger.addIngredient(ing1);
        burger.addIngredient(ing2);

        assertEquals(100f * 2 + 10f + 20f, burger.getPrice());
    }

    @Test
    @DisplayName("Корректный расчет цены только с булкой")
    void testPriceWithoutIngredients() {
        burger.setBuns(bun);

        assertEquals(100f * 2, burger.getPrice());
    }
}
