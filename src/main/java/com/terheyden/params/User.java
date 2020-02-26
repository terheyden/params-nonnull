package com.terheyden.params;

/**
 * A typical user class.
 */
public class User {

    private static final String MY_STRING = null;

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {

        if (name == null) {
            return "(none)";
        }

        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String myNullMethod() {
        return null;
    }
}
