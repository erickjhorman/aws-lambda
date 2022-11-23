package dev.danvega;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubscribersTest {

    @Test
    @DisplayName("Should Return subscribers from rds database")
    void testHandleRequest() {
        var sut = new Subscribers();
        assertEquals(5, sut.handleRequest().size());

    }
}