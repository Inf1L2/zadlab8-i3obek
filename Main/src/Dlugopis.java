public class Dlugopis extends Product {

    public Dlugopis() {
    }

    public Dlugopis(String name, String describe, double price) {
        super(name, describe, price);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(3);
    }

    @Override
    public void setName(String name) {
        super.setName("Piszący");
    }

    @Override
    public void setDescribe(String describe) {
        super.setDescribe("Papierowy");
    }

    @Override
    public void buy() {
        System.out.println("Piszący po papierze 3PLN");
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
