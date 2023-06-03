package Theory.Synchronization;

class book {
    static int tickets = 20;

    // synchronized static to book movie ticket
    synchronized static void book(int request, String name) {
        // logic to book ticket
        if (tickets >= request) {
            System.out.println(name + " booked " + request + " ticket.");
            tickets = tickets - request;
            System.out.println("Tickets left: " + tickets);
        } else {
            System.out.println("No tickets are available.");
        }
    }
}

// Helper class 2, extending Thread class.
// book method is called from this class using the object
// passed from main class.
class myThread1 extends Thread {
    book obj;
    int n;
    String name;

    myThread1(book obj, String name, int n) {
        this.obj = obj;
        this.n = n;
        this.name = name;
    }

    // runs threads
    public void run() {
        obj.book(n, name);
    }
}

class myThread2 extends Thread {
    book obj;
    int n;
    String name;

    myThread2(book obj, String name, int n) {
        this.obj = obj;
        this.n = n;
        this.name = name;
    }

    // runs threads
    public void run() {
        obj.book(n, name);
    }
}

// Driver class
public class Prog_Mutual_Exclusion1 {
    // Driver method
    public static void main(String[] args) {
        // Creating multiple objects "obj" and "obj2" of
        // book class and passing it to myThread class.
        book obj = new book();
        myThread1 t1 = new myThread1(obj, "Shubham", 7);
        myThread2 t2 = new myThread2(obj, "Shubham1", 6);
        book obj2 = new book();
        myThread1 t3 = new myThread1(obj2, "Sharmistha", 7);
        myThread2 t4 = new myThread2(obj2, "Sharmistha1", 5);
        // When a program calls the start() method, a new
        // thread is created and then the run() method is
        // executed.

        // Starting threads created above
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}