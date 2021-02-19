package com.designpatterns.facade;

public class TVSet extends Equipment {
    protected String channel;
    protected int soundLevel;

    public TVSet() {
        super("Hall TV Set");
    }

    public void setChannel(String channel, int soundLevel) {
        this.channel = channel;
        this.soundLevel = soundLevel;

        System.out.println("Turning on " + channel + " and setting TV volume to " + soundLevel);
    }
}
