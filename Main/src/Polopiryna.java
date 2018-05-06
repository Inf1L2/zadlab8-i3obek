public class Polopiryna extends Product {

    public Polopiryna() {
    }

    public Polopiryna(String name, String describe, double price) {
        super(name, describe, price);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(5);
    }

    @Override
    public void setName(String name) {
        super.setName("Polopiryna");
    }

    @Override
    public void setDescribe(String describe) {
        super.setDescribe("Wstawaj nie udawaj");
    }

    @Override
    public void buy() {
        System.out.println("Na ból czegoś za 5 PLN");
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
