package com.chezouam.tabletennis.entity;

public enum Classment {
    NC("NC"),E6("E6"),E4("E4"),E2("E2"),E0("E0"),D6("D6"),D4("D4"),D2("D2"),D0("D0");

    private String classment;

    Classment(String classment) {
        this.classment = classment;
    }

    @Override
    public String toString() {
        return "Classment{" +
                "classment='" + classment + '\'' +
                '}';
    }
}
