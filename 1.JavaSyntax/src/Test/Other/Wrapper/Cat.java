package Test.Other.Wrapper;

/**
 * Created by Антон on 01.06.2017.
 */
class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {};

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Васька ");
        Cat catWrap = new CatWrapper(cat);
        printName(catWrap);
    }

    public static void printName(Cat named) {
        System.out.println(named.getName());
    }
}
