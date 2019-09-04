package Test.Other.Wrapper;

/**
 * Created by Антон on 01.06.2017.
 */
class CatWrapper extends Cat {
    private Cat original;

    public CatWrapper (Cat cat) {
        //super("Fuck");
        this.original = cat;
    }

    public String getName() {
        return "Кот по имени " + original.getName() /*+ name*/;
    }

    public void setName(String name) {
        original.setName(name);
    }
}
