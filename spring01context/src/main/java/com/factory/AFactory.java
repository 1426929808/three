package com.factory;

public class AFactory {
  static A ainstances = new A();
  //静态
  public static A createA(){
      return ainstances;
  }
  //实例
  public A createB(){
      return ainstances;
  }
}
