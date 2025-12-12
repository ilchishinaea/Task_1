package baseTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.mockito.Mockito.lenient;

@ExtendWith(MockitoExtension.class)
    public abstract class BurgerBaseTest {

        @Mock
        protected Bun bun;

        @Mock
        protected Ingredient ing1;

        @Mock
        protected Ingredient ing2;

        @Mock
        protected Ingredient ing3;

        protected Burger burger;

        @BeforeEach
        void setup() {
            burger = new Burger();

            lenient().when(bun.getPrice()).thenReturn(100f);
            lenient().when(bun.getName()).thenReturn("black bun");

            lenient().when(ing1.getName()).thenReturn("one");
            lenient().when(ing2.getName()).thenReturn("two");
            lenient().when(ing3.getName()).thenReturn("three");

            lenient().when(ing1.getPrice()).thenReturn(10f);
            lenient().when(ing2.getPrice()).thenReturn(20f);
            lenient().when(ing3.getPrice()).thenReturn(30f);

            lenient().when(ing1.getType()).thenReturn(IngredientType.SAUCE);
            lenient().when(ing2.getType()).thenReturn(IngredientType.FILLING);
            lenient().when(ing3.getType()).thenReturn(IngredientType.SAUCE);
        }
}
