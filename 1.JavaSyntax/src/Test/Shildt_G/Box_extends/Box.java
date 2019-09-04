package Test.Shildt_G.Box_extends;

/**
 * Created by Антон on 05.04.2017.
 */
class Box {
    private double width;  // ПРИВАТНЫЕ ПОЛЯ НАСЛЕДУЮТСЯ! НО имеют закрытый доступ. Могут быть перекрыты в подклассе
    private double height;
    private double depth;

    //Сконструировать клон
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
