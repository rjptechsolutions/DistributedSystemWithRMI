import java.rmi.server.*;
import java.rmi.server.UnicastRemoteObject;

public class AddMethod extends UnicastRemoteObject implements Addinterface {

    public AddMethod() throws Exception {
        super();
    }

    @Override
    public int Add(int a, int b) {
        int c = a + b;
        return c;
    }
}