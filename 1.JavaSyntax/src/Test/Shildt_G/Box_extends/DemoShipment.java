package Test.Shildt_G.Box_extends;

/**
 * Created by Антон on 05.04.2017.
 */
public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println(String.format("Объем shipment1 равен %f", vol));
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставкиЖ $" + shipment1.cost);

        vol = shipment2.volume();
        System.out.println(String.format("Объем shipment2 равен %f", vol));
        System.out.println("Вес shipment1 равен " + shipment2.weight);
        System.out.println("Стоимость доставкиЖ $" + shipment2.cost);
    }
}
