package interfaces;

public class Resturant {

    public void receive(Customer c){
        c.eat();
        c.pay();
        System.out.println("Welcome to the Resturant.");
    }
}
