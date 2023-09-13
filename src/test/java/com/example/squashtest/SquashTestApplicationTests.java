package com.example.squashtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquashTestApplicationTests {

    @Test
    public void testFailure() {
        Assertions.assertEquals(2, 3);
    }

}
