package Test.Shildt_G.This_in_constructor;

/**
 * Created by Антон on 17.04.2017.
 */

//Вызов перегружаемых конструкторов по ссылке this()
public class MyClass {
    int a, b;

    //Инициализировать поля a и b по отдельности
    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    //Инициализировать поля a и b одним и тем же значением
    MyClass(int i) {
        this(i, i); //по этой ссылке вызывается конструктор MyClass(i, i);
    }

    //Инициализировать поля a и b нулевым значением по умолчанию
    MyClass() {
        this(0); //а по этой ссылке вызывается конструктор MyClass(0);
    }
}

