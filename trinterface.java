import java.rmi.Remote;
import java.rmi.RemoteException;

public interface trinterface extends Remote {
    int tr(int a, int b, int c) throws RemoteException;

}