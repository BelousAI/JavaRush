package Test.Shildt_G.Lambda.Example1;

/**
 * Created by Антон on 19.04.2017.
 */
class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum; //Объявлена ссылочная переменная на функциональный интерфейс

        //Здесь лямда-выраж-е просто явл. константным выражением.
        //Когда оно присваивается ссылочной переменной, получается экземпляр класса,
        //в кот. лямбда-выраж. реализует метод getValue() из функц-го интерфейса MyNumber
        myNum = () -> 123.45;
        System.out.println("Фиксированное значение: " + myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println("Еще одно случайное значение: " + myNum.getValue());

        //Лямбдо-выраж д.б. совместимо с абстрактным методом, опред-м
        //в функц интерфейсе
        //myNum = () -> "123.45";
    }
}
