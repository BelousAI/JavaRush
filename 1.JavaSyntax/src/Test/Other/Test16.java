package Test.Other;

/**
 * Created by Антон on 22.06.2017.
 */
public class Test16 {
    private Type type;

    public Type getType() { return type; }
    public void setType(Type type) { this.type = type; }

    public static enum Type {
        SINGLE_CHOICE, MULIT_CHOICE, TEXT
    }

    public static void main(String[] args) {
        Test16 test16 = new Test16();
        test16.setType(Type.TEXT);
        Test16.Type type = test16.getType();

        if (type == Type.TEXT) {
            System.out.println("type = TEXT");
        }
    }
}
