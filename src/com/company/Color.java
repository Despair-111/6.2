package com.company;

public enum Color {
    RED("Красный"),
    BLACK("Черный"),
    BLUE("Синий"),
    WHITE("Белый"),
    GRAY("Серый");

    private final String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}