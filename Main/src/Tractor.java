public class Tractor extends Product {

    public Tractor() {
    }

    public Tractor(String name, String describe, double price) {
        super(name, describe, price);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(555555);
    }

    @Override
    public void setName(String name) {
        super.setName("CiukCiuk");
    }

    @Override
    public void setDescribe(String describe) {
        super.setDescribe("czarny");
    }

    @Override
    public void buy() {
        System.out.println(
                "I bought a black tractor, capaciticy 2400!");
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