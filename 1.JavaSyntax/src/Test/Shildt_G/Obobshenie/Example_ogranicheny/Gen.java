package Test.Shildt_G.Obobshenie.Example_ogranicheny;

/**
 * Created by Антон on 19.04.2017.
 */

//Создать экземпляр типа Т нельзя!
//Статические члены обобщенного класса не допустимы!!!
class Gen<T> {
    T ob;

    //static Solution ob2;      //Недопустимо!!!

    Gen() {
        //ob = new Solution();  //Недопустимо!!!
    }

    //static Solution getOb() {return ob;}   //Недопустимо!!!
}
