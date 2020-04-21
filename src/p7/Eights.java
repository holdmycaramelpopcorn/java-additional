package p7;
public class Eights extends Thread {
    Main m;
    final int n = 8;
    Eights(Main m) {
        this.m = m;
    }

    @Override
    public void run() {
        m.printTable(n);
    }
}
