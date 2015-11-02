package Client;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Created by Kingv_000 on 02.11.2015.
 */
public interface IMath extends Remote, Serializable {

    public int sum(int a, int b);


}
