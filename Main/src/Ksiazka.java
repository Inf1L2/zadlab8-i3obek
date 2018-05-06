public class Ksiazka extends Product {

    public Ksiazka() {
    }

    public Ksiazka(String name, String describe, double price) {
        super(name, describe, price);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(35);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }


    @Override
    public void setDescribe(String describe) {
        super.setDescribe(describe);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescribe() {
        return super.getDescribe();
    }

    @Override
    public void buy() {
        System.out.println("Książka drukowana duża i ciężka za 35PLN");
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
