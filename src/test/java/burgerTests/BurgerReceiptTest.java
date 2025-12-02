package burgerTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testbase.BurgerTestBase;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BurgerReceiptTest extends BurgerTestBase {

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
