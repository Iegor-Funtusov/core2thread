package ua.com.alevel;

/**
 * @author Iehor Funtusov, created 04/12/2020 - 7:34 PM
 */

public class Inc {

    private int i;

    public int getI() {
        return i;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }
}
