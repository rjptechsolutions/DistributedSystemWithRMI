import java.rmi.Remote;
import java.rmi.RemoteException;

public interface subinterface extends Remote {
    int Sub(int a, int b) throws RemoteException;

}