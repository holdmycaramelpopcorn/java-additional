package p7;
public class Sevens extends Thread {
    Main m;
    final int n = 7;
    Sevens (Main m) {
        this.m = m;
    }

    @Override
    public void run() {
        m.printTable(n);
    }
}

