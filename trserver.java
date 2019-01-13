import java.rmi.Naming;

public class trserver extends trmethod{

    public trserver() throws Exception {
        super();
    }

    public static void main(String[] args) {
        try {
            trmethod am = new trmethod();
            Naming.rebind("Tr", am);
            System.out.println("Tr Server Ready ");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
