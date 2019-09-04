package Test.Other.rmi.client;

import java.rmi.Naming;
import Test.Other.rmi.server.MyRemote;

public class MyClient {
    public static void main(String[] args) {
        new MyClient().go();
    }

    private void go(){
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/Удаленный привет");
            String s = service.sayHello();
            System.out.println(s);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
