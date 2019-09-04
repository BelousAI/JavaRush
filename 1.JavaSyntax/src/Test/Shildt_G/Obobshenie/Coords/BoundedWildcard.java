package Test.Shildt_G.Obobshenie.Coords;

/**
 * Created by Антон on 18.04.2017.
 */

//Демонстрация применения ограниченных метасимволов "?" (extends которые)
// указывает для метосимвола верхнюю границу "включительно"
class BoundedWildcard {
    static void showXY(Coords<?> c) {
        System.out.println("Координаты X Y:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("Координаты X Y Z:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("Координаты X Y Z Solution:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y +
            " " + c.coords[i].z + " " + c.coords[i].t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD[] td = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23)
        };

        Coords<TwoD> tdlocs = new Coords<TwoD>(td);

        System.out.println("Содержимое объекта tdlocs.");
        showXY(tdlocs);    //Верно, это тип TwoD
        //showXYZ(tdlocs); //Ошибка, это не тип ThreeD
        //showAll(tdlocs); //Ошибка, это не тип FourD

        //а теперь создаем несколько объектов типа FourD
        FourD[] fd = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17)
        };

        Coords<FourD> fdlocs = new Coords<FourD>(fd);

        System.out.println("Содержимое объекта fdlocs.");
        //здесь все верно
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
