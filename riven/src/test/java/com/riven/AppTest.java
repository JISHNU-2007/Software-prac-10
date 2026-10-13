package com.riven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void greetWorks() {
        assertEquals("Hello, Riven", App.greet("Riven"));
    }
}
