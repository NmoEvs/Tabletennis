package com.chezouam.tabletennis.entity;

public enum PlayStyle {

    DEF("DEF"),ALL("ALL"),OFF("OFF");

    PlayStyle(String playstyle) {
        this.playstyle = playstyle;
    }

    @Override
    public String toString() {
        return playstyle;
    }

    private String playstyle;
}
