package io.training.singledesignpattern;

public class Singleton {
    public String a;

    private Singleton(){
      a = "Hey now brown cow.";
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
