package Test.Other.rmi.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyService extends UnicastRemoteObject implements MyRemote {

    public MyService() throws RemoteException {}

    @Override
    public String sayHello() throws RemoteException {
        return "Сервер говорит: 'Привет!'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyService();
            Naming.rebind("Удаленный привет", service);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
