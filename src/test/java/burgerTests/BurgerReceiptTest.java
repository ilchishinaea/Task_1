package burgerTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import baseTest.BurgerBaseTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BurgerReceiptTest extends BurgerBaseTest {

    @Test
    @DisplayName("Чек содержит имя булки, ингредиентов и цену")
    void getReceiptReturnsCorrectData() {
        burger.setBuns(bun);
        burger.addIngredient(ing1);
        burger.addIngredient(ing2);

        String receipt = burger.getReceipt();

        assertTrue(receipt.contains("black bun"));
        assertTrue(receipt.contains("one"));
        assertTrue(receipt.contains("two"));
        assertTrue(receipt.contains("Price"));
    }
}
