package bunTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import praktikum.Bun;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BunTest {

    Bun bun;

    @Test
    @DisplayName("Конструктор Bun корректно задаёт поля")
    void bunConstructorShouldSetFields() {
        bun = new Bun("black bun", 100f);

        assertEquals("black bun", bun.name);
        assertEquals(100f, bun.price);
    }

    @Test
    @DisplayName("bun.getName возвращает корректное имя")
    void getNameReturnsValues(){
        bun = new Bun("white bun", 200f);
        assertEquals("white bun", bun.getName());
    }

    @Test
    @DisplayName("bun.getPrice возвращает корректную цену")
    void getPriceReturnsValues(){
        bun = new Bun("red bun", 300f);
        assertEquals(300f, bun.getPrice());
    }
}
