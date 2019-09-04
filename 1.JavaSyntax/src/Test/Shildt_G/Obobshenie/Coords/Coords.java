package Test.Shildt_G.Obobshenie.Coords;

/**
 * Created by Антон on 18.04.2017.
 */
//Обобщенный класс
class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}
