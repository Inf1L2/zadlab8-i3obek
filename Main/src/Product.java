public abstract class Product {

    private String name,describe;
    private double price;

    public Product() {
    }

    public Product(String name, String describe, double price) {
        this.name = name;
        this.describe = describe;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public abstract void buy();

    public abstract void showInfo();

    @Override
    public String toString() {
        return "Product = " + getName() +
                ",\tOpis = " + getDescribe() +
                ",\tCena = " + getPrice();
    }
}