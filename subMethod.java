import java.rmi.RemoteException;
import java.rmi.server.*;
import java.rmi.server.UnicastRemoteObject;

public class subMethod extends UnicastRemoteObject implements subinterface {

    public subMethod() throws Exception {
        super();
    }

    @Override
    public int Sub(int a, int b) {
        int c = a - b;
        return c;
    }
}