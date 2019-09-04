package Test.Shildt_G.Serializable.Example;

import java.io.Serializable;

public class User {
    String name = "Tor";
    int power;
    transient Sword sword;

    static String staticField = "Hello";

}
