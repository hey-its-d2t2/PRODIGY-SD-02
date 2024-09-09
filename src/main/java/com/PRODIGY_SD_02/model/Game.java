package com.PRODIGY_SD_02.model;

public class Game {
    private int targetNumber;
    private int attempts;
    private String message;

    public Game() {}

    public Game(int targetNumber, int attempts, String message) {
        this.targetNumber = targetNumber;
        this.attempts = attempts;
        this.message = message;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public void setTargetNumber(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
