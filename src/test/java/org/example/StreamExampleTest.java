package org.example;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.ThrowingConsumer;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;

public class StreamExampleTest {

    @TestFactory
    Stream<DynamicTest> streamTest(){
//        dane wejściowe
        Integer[] array = {1,2,3,4};
        Iterator<Integer> inputGenerator = Arrays.asList(array).iterator();

//        Nazwa testów
        Function<Integer, String> displayNameGenerator = (input) -> "Data input: " + input;

//        Text executor
        ThrowingConsumer<Integer> testExecutor = (input) -> {
            System.out.println(input);
            assertEquals(0, input % 2);
        };
        return stream(inputGenerator,displayNameGenerator,testExecutor);
    }
}
