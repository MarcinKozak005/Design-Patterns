package Prototype;

public class Product implements Prototype {
    @Override
    public Prototype makeCopy() {
        Product product = null;
        try {
            product = (Product) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }
}
