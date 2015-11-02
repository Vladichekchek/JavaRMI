package Server;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Kingv_000 on 02.11.2015.
 */
public class Server implements Remote  {
    public static void main(String[] args) {
        try{
            Server obj = new Server();
            MathAction stub = null;
            try {
                  stub = (MathAction) UnicastRemoteObject.exportObject(obj, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }

            try {
                Registry  registry = LocateRegistry.getRegistry();
                try {
                    registry.bind("IMath", stub);
                } catch (AlreadyBoundException e) {
                    e.printStackTrace();
                }

                System.err.println("Server.Server ready");
            } catch (RemoteException e) {
                System.err.println("Server.Server exception: " + e.toString());
                e.printStackTrace();

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }





    }


}
