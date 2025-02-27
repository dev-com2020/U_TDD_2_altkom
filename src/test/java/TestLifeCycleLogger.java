import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface TestLifeCycleLogger {
    static final Logger log = LoggerFactory.getLogger(TestLifeCycleLogger.class.getName());

    @BeforeAll
    static void beforeAllTest(){
        log.info("beforeAllTests");
    }

    @BeforeEach
    default void beforeEachTest(TestInfo testInfo){
        log.info("Podczas wykonywania {}", testInfo.getDisplayName());
    }
}
