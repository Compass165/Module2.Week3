import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StandardTests {
    @BeforeAll
    static void initAll() {

    }

    @BeforeEach
    void init() {

    }

    @Test
    void succeedingTest() {

    }

    @Test
    void fallingTest() {
        fail("a failing test");
    }

   @Test
    @Disabled("for demonstration purposes") void
    skippedTest() {

   }

   @AfterEach
    void tearDown(){}
    @AfterAll
    static void tearDownAll() {

    }


}

