import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestGuiTable {

    Character character;

    @BeforeEach
    void setUp() throws Exception {
        character = new Character();
    }

    @Test
    @DisplayName("Ensures name correctness")
    public void testCharacter() {
        character.setName("Carlitos");

        assertEquals(character.getName(), "Carlitos", "Al toke el nombre");
    }
}
