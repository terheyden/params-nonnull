package com.terheyden.params;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * User tests.
 */
class UserTest {

    private static final String NONE = "(none)";

    @Test
    public void test() {

        User user = new User(null);
        assertEquals(NONE, user.getName());
        user.setName(null);
        assertEquals(NONE, user.getName());
    }
}
