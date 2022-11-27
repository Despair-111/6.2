package com.company;

public enum Model {
    RAPID("Granta"),
    VESTA("Filder"),
    X7("Lacetti"),
    ZAFIRA("Zafira"),
    ENZO("Enzo");

    private final String name;

    Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
