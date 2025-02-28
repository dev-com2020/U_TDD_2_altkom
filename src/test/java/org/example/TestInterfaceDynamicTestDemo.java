package org.example;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertTrue;

interface TestInterfaceDynamicTestDemo {
    @TestFactory
    default Collection<DynamicTest> dynamicTestCollection(){
        return Arrays.asList(
                DynamicTest.dynamicTest("1st interface test", ()-> assertTrue(true)),
                DynamicTest.dynamicTest("2nd interface test", ()-> assertTrue(true))
        );
    }
}
