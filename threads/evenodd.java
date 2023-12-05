class NumberPrinter {
    private static boolean isEvenTurn = true;

    synchronized void printEven(int num) {
        while (!isEvenTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even Number: " + num);
        isEvenTurn = false;
        notify();
    }

    synchronized void printOdd(int num) {
        while (isEvenTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd Number: " + num);
        isEvenTurn = true;
        notify();
    }
}

class EvenNumbers extends Thread {
    NumberPrinter n;
    EvenNumbers(NumberPrinter n)
    {
        this.n=n;
    }
    public void run() {
        for (int i = 0; i < 500000; i = i + 2) {
            n.printEven(i);
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Exception: " + ex);
            }*/
        }
    }
}

class OddNumbers extends Thread {
    NumberPrinter n;
    OddNumbers(NumberPrinter n)
    {
        this.n=n;
    }
    public void run() {
        for (int i = 1; i < 500000; i = i + 2) {
            n.printOdd(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Exception: " + ex);
            }
        }
    }
}

public class Main {
    public static void main(String args[]) {
        NumberPrinter n1=new NumberPrinter();
        EvenNumbers t1 = new EvenNumbers(n1);
        OddNumbers t2 = new OddNumbers(n1);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
