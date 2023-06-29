package com.patterns.structural_patterns.bridge_pattern;

public interface Device {
  boolean isEnable();
  void enable();
  void disble();
  int getVolume();
  void setVolulme();
  int getChanel();
  void setChanel(int chanel);
  void printStatus();
}
