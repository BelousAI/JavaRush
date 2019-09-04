package Test.Other;

class Parent {
    static {
        System.out.println("Parent static block");
    }

    {
        System.out.println("Parent block");
    }

    Parent() {
        System.out.println("Parent constructor");
    }
}

public class Child extends Parent {
    static {
        System.out.println("Child static block");
    }

    {
        System.out.println("Child block");
    }

    Child() {
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        new Child();
    }
}
