package Test.Shildt_G.Sety_Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.mail.ru");
        System.out.println(address);

        InetAddress[] sw = InetAddress.getAllByName("www.nba.com");
        for (InetAddress ia : sw) {
            System.out.println(ia);
        }

        byte[] b = address.getAddress();
        for (byte num : b) {
            System.out.print(num + ".");
        }

        String str = address.getHostAddress();
        System.out.println("\n" + str);

        str = address.getHostName();
        System.out.println(str);
    }
}
