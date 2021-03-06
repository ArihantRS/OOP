public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name,healthyExtra2Name;
    private double healthyExtra1Price,healthyExtra2Price;
    public HealthyBurger( String patty, double price) {
        super("Healthy", patty, price, "Multigrain");
    }
    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println("Added " + healthyExtra1Name + " for an extra "
                + healthyExtra1Price);
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println("Added " + healthyExtra2Name + " for an extra "
                + healthyExtra2Price);
    }
    @Override
    public double itemizeHamburger(){
        return super.itemizeHamburger()+healthyExtra1Price+healthyExtra2Price;
    }
}
