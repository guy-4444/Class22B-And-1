package com.guy.class22b_and_1;

public class Cooking {

    private String room = "";
    private int temp = 0;
    private int duration = 0;

    public Cooking() {
    }

    public Cooking(String room) {
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public Cooking setRoom(String room) {
        this.room = room;
        return this;
    }

    public int getTemp() {
        return temp;
    }

    public Cooking setTemp(int temp) {
        this.temp = temp;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public Cooking setDuration(int duration) {
        this.duration = duration;
        return this;
    }
}
