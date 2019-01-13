import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Addinterface extends Remote {
    int Add(int a, int b) throws RemoteException;

}