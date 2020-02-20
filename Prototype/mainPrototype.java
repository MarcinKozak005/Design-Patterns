package Prototype;

public class mainPrototype
{
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(System.identityHashCode(product));

        Product clonedProduct = (Product) product.makeCopy();
        System.out.println(System.identityHashCode(clonedProduct));

        System.out.println("-----------------");
        Product p1 = product;
        System.out.println(System.identityHashCode(p1));

    }
}
