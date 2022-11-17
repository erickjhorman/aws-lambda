package dev.danvega;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloLambdaTest {

    @Test
    @DisplayName("Should Return Hello Message")
    void testHandleRequest() {
        var helloLambda = new HelloLambda();
        Assertions.assertEquals("Hello, AWS Lambda!", helloLambda.handleRequest());
    }
}