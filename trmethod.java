import java.rmi.server.*;
import java.rmi.*;
import java.util.*;

public class trmethod extends UnicastRemoteObject implements trinterface {
    public trmethod() throws Exception {
        super();
    }

    @Override
    public int tr(int a, int b, int c) {
        try {
            switch (c) {
            case 1:
                Addinterface obj = (Addinterface) Naming.lookup("Add");
                int abc = obj.Add(a, b);
                return abc;
            // break;
            case 2:
                subinterface obj1 = (subinterface) Naming.lookup("Sub");
                int xyz = obj1.Sub(a, b);
                return xyz;
            // break;
            default:
                int k = 0;
                return k;
            // break;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;

    }
}