import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.params.provider.EnumSource.Mode.EXCLUDE;

public class ValueSourceStringParamTest {

    public static Stream<String> stringProvider() {
        return Stream.of("witaj","świecie");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Jan","Kowalski"})
    void testWithStrings(String argument){
        System.out.println("Test z parametrami " + argument);
        assertNotNull(argument);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2})
    void testWithInts(int argument){
        System.out.println("Test z parametrami " + argument);
        assertNotNull(argument);
    }

    @ParameterizedTest
    @EnumSource(TimeUnit.class)
    void testWithEnum(TimeUnit argument){
        System.out.println("Test z parametrem " + argument);
        assertNotNull(argument);
    }
    @ParameterizedTest
    @EnumSource(value = TimeUnit.class, names = {"DAYS", "HOURS"})
    void testWithEnumFiltered(TimeUnit argument){
        System.out.println("Test z parametrem " + argument);
        assertNotNull(argument);
    }
    @ParameterizedTest
    @EnumSource(value = TimeUnit.class, mode = EXCLUDE, names = {"DAYS", "HOURS"})
    void testWithEnumFilteredExclude(TimeUnit argument){
        System.out.println("Test z parametrem " + argument);
        assertNotNull(argument);
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWithStringProvider(String argument){
        System.out.println("Test z parametrami " + argument);
        assertNotNull(argument);
    }

    @ParameterizedTest
    @CsvSource({"tomek, 1", "anna, 2", "janek, 3"})
    void testWithCsvSource(String first,int second){
        System.out.println("Test z parametrami "+ first + " " + second);
        assertNotEquals(0,second);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/input.csv")
    void testWithCsvSourceFile(String first,int second){
        System.out.println("Test z parametrami "+ first + " " + second);
        assertNotEquals(0,second);
    }
}
