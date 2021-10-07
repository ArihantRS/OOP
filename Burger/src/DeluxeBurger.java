public class DeluxeBurger extends Hamburger {
    final String msg=" No additional items can be added.";
    public DeluxeBurger() {
        super("Deluxe Burger", "Aloo Tikki", 19.10, "Wheat");
       super.addHamburgerAddition1("Fries",0);
        super.addHamburgerAddition2("Drink",0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println(msg);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println(msg);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println(msg);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println(msg);

    }
}
