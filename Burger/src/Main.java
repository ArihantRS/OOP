import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean q=true;
        while(q){
        System.out.println("Choose 1 for HamBurger,2 for Deluxe Burger,3 for Healthy Burger ");
        switch(sc.nextInt()){

            case 1:System.out.println(" Enter name, patty, price ,bun");
            Hamburger hb=new Hamburger(sc.next(), sc.next(), sc.nextDouble(), sc.next());
                System.out.println("Enter 3 additions and price");
                hb.addHamburgerAddition1(sc.next(),sc.nextDouble());
                hb.addHamburgerAddition2(sc.next(),sc.nextDouble());
                hb.addHamburgerAddition3(sc.next(),sc.nextDouble());
                System.out.println("Total is:"+hb.itemizeHamburger());
                q=false;
                break;
            case 2: DeluxeBurger db=new DeluxeBurger();
                System.out.println("Total price:"+db.itemizeHamburger());
                q=false;
                break;
            case 3:
                System.out.println("Enter patty and price");
                HealthyBurger h=new HealthyBurger(sc.next(),sc.nextDouble());
                System.out.println("Add 1 addition and price");
                h.addHamburgerAddition1(sc.next(),sc.nextDouble());
                System.out.println("Add 1 healthy addition and price");
                h.addHealthyAddition1(sc.next(), sc.nextDouble());
                System.out.println("Total is:"+h.itemizeHamburger());
                q=false;break;
            default: break;
        }
        }
    }
}
