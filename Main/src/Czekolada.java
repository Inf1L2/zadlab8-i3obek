public class Czekolada extends Product {

    public Czekolada() {
    }

    public Czekolada(String name, String describe, double price) {
        super(name, describe, price);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(2);
    }

    @Override
    public void setName(String name) {
        super.setName("Milka Wedlowska od Goplany");
    }

    @Override
    public void setDescribe(String describe) {
        super.setDescribe("Tolerancyjna");
    }

    @Override
    public void buy() {
        System.out.println("Czekoladowa biało-czarna 2pln");
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
