package com.minidart.typewriter.entities;

public class Message {
    private String bet;
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Message(String bet) {
        this.bet = bet;
    }
    public Message(){}

    public String getBet() {
        return bet;
    }

    public void setBet(String bet) {
        this.bet = bet;
    }

    @Override
    public String toString() {
        return "Message{" +
                "bet='" + bet + '\'' +
                ", length=" + length +
                '}';
    }
}
