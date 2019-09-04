package Test.Shildt_G.Package_class;

/**
 * Created by Антон on 02.06.2017.
 */
public class PkgTest {
    public static void main(String[] args) {
        Package pkgs[] = Package.getPackages();

        for (int i = 0; i < pkgs.length; i++) {
            System.out.println(
                    pkgs[i].getName() + " " +
                    pkgs[i].getImplementationTitle() + " " +
                    pkgs[i].getImplementationVendor() + " " +
                    pkgs[i].getImplementationVersion()
            );
        }
    }
}
