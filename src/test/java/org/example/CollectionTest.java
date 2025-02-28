package org.example;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionTest {

    @TestFactory
    Collection<DynamicTest> dynamicTestCollection(){
        return Arrays.asList(
                DynamicTest.dynamicTest("1st dynamic test", ()-> assertTrue(true)),
                DynamicTest.dynamicTest("2nd dynamic test", ()-> assertEquals(4,2+2))

        );
    }
    @TestFactory
    Stream<DynamicTest> dynamicTestStream(){
        Stream<String> stringStream = Stream.of("A","B","C");
        return stringStream.map(
                input -> DynamicTest.dynamicTest("Nazwa testu dla wejścia " + input,
                        () -> {
                            System.out.println("Testujemy " + input);
                        })
        );
    }
}
