package Server;

import Server.IMath;

/**
 * Created by Kingv_000 on 02.11.2015.
 */
public class MathAction implements IMath {

    @Override
    public int sum(int a, int b) {

        return a+b;

    }
}
