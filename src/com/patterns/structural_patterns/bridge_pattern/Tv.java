package com.patterns.structural_patterns.bridge_pattern;

public class Tv implements Device{
  private boolean on = false;
  private int volume = 30;
  private int channel = 1;

  @Override
  public boolean isEnable() {
    return on;
  }

  @Override
  public void enable() {
    on = true;
  }

  @Override
  public void disble() {
    on = false;
  }

  @Override
  public int getVolume() {
    return volume;
  }

  @Override
  public void setVolulme(int percent) {
    if (percent > 100) volume = 100;
    else volume = Math.max(percent, 0);
  }

  @Override
  public int getChannel() {
    return channel;
  }

  @Override
  public void setChannel(int channel) {
    this.channel = channel;
  }

  @Override
  public void printStatus() {
    System.out.println("-----------------");
    System.out.println("TV");
    if (on) System.out.println("Status: Enabled");
    else System.out.println("Status: Disabled");
    System.out.printf("Current volume is: %d%n", volume);
    System.out.printf("Current channel is: %d%n", channel);
    System.out.println("-----------------");
  }
}
