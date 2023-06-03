package Theory.Synchronization;

class BookSeat{
    int total_seat=10;

    // // without synchronization
    // void bookseat(int seat){
    //     if(total_seat>=seat){
    //         System.out.println("Booked .................");
    //         total_seat=total_seat-seat;
    //         System.out.println("Seat Left = "+total_seat);
    //     }else{
    //         System.out.println("No seat left");
    //         System.out.println("Seat Left = "+total_seat);
    //     }
    // }




    // // type 1: synchroniztion method
    // synchronized void bookseat(int seat) {
    //     System.out.println(Thread.currentThread().getName());
    //     System.out.println(Thread.currentThread().getName());
    //     System.out.println(Thread.currentThread().getName());
    //     System.out.println(Thread.currentThread().getName());
    //     if (total_seat >= seat) {
    //         System.out.println("Booked .................");
    //         total_seat = total_seat - seat;
    //         System.out.println("Seat Left = " + total_seat);
    //     } else {
    //         System.out.println("No seat left");
    //         System.out.println("Seat Left = " + total_seat);
    //     }
    //     System.out.println(Thread.currentThread().getName());
    //     System.out.println(Thread.currentThread().getName());
    //     System.out.println(Thread.currentThread().getName());
    //     System.out.println(Thread.currentThread().getName());
    // }

// type 2: synchronized block
    void bookseat(int seat) {

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

        // synchronized block
       synchronized(this){
           if (total_seat >= seat) {
               System.out.println("Booked .................");
               total_seat = total_seat - seat;
               System.out.println("Seat Left = " + total_seat);
           } else {
               System.out.println("No seat left");
               System.out.println("Seat Left = " + total_seat);
           }
       }

       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getName());
    }
}

public class Prog_Mutual_Exclusion extends Thread {
    static BookSeat ob1;
    int seat;

    public void run(){
        ob1.bookseat(seat);
    }

    public static void main(String[] args) {
        ob1=new BookSeat();

        Prog_Mutual_Exclusion ob2=new Prog_Mutual_Exclusion();
        ob2.seat=7;
        ob2.start();
        Prog_Mutual_Exclusion ob3=new Prog_Mutual_Exclusion();
        ob3.seat=8;
        ob3.start();


    }
    
}
