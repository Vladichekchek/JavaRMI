package Client;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Kingv_000 on 02.11.2015.
 */
public class Client  {
    private Client(){}

    public static void main(String[] args) {
        String host = (args.length < 1) ? null : args[0];
        try {
            try {
                Registry registry = LocateRegistry.getRegistry(host);
                IMath stub = (IMath) registry.lookup("IMath");
                Integer respone = stub.sum(2,10);
                System.out.println(respone);
            } catch (RemoteException e) {
                e.printStackTrace();
            }



        }
        catch (Exception e){
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }

    }

}
