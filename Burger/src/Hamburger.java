public class Hamburger {
    private String name;
    private String patty;
    private double price;
    private String bun;
    private String addition1Name, addition2Name, addition3Name, addition4Name;

    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String patty, double price, String bun) {
        this.name = name;
        this.patty = patty;
        this.price = price;
        this.bun = bun;
        System.out.println(name+" burger with "+patty+" patty and "+bun+"  bun is of "+price);
    }
    public void addHamburgerAddition1(String name, double price) {
        addition1Price = price;
        addition1Name = name;
        System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Price = price;
        addition2Name = name;
        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
    }

    public void addHamburgerAddition3(String name, double price) {
        addition3Price = price;
        addition3Name = name;
        System.out.println("Added " + addition3Name + " for an extra " + addition3Price);

    }

    public void addHamburgerAddition4(String name, double price) {
        addition4Price = price;
        addition4Name = name;
        System.out.println("Added " + addition4Name + " for an extra " + addition4Price);

    }
    public double itemizeHamburger(){
        this.price+=addition1Price+addition2Price+addition3Price+addition4Price;
        return this.price;
    }
}
