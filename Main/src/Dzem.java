public class Dzem extends Product {

    public Dzem() {
    }

    public Dzem(String name, String describe, double price) {
        super(name, describe, price);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(8);
    }

    @Override
    public void setName(String name) {
        super.setName("Słoik");
    }

    @Override
    public void setDescribe(String describe) {
        super.setDescribe("Smaczny");
    }

    @Override
    public void buy() {
        System.out.println("Słoik dżemu smacznego i czarnego za 8PLN");
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Price: " + getPrice()
                        + ",\tName: " + getName()
                        + ",\tDescribe: " + getDescribe()
        );
    }
}
