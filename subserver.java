import java.rmi.Naming;

public class subserver extends subMethod {

    public subserver() throws Exception {
        super();
    }

    public static void main(String[] args) {
        try {
            subMethod am = new subMethod();
            Naming.rebind("Sub", am);
            System.out.println("Sub Server Ready ");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}