import java.rmi.Naming;

public class AddServer extends AddMethod {

    public AddServer() throws Exception {
        super();
    }

    public static void main(String[] args) {
        try {
            AddMethod am = new AddMethod();
            Naming.rebind("Add", am);
            System.out.println("Add Server Ready ");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
