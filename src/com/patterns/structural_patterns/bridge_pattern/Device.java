package com.patterns.structural_patterns.bridge_pattern;

public interface Device {
  boolean isEnable();
  void enable();
  void disble();
  int getVolume();
  void setVolulme(int percent);
  int getChannel();
  void setChannel(int chanel);
  void printStatus();
}
