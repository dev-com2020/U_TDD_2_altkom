import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssumptionsTest {

    @Test
    void assumeTrueTest(){
        assumeTrue(false);
        fail("Test 1 jest false");
    }
}
