package product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ProductManager{
    
    public static LinkedList<Product> arrayProduct = new LinkedList<>();
//    public static ArrayList<Product> arrayProduct = new ArrayList<>();
    
    public boolean add (Product e) {
        if (arrayProduct.add(e))
            return true;
        else 
            return false;
    }
    
    public void delete(int id) {
        arrayProduct.removeIf(product -> product.getID() == id);
    }
    
    public void searchProduct(String name) {
        for (Product product: arrayProduct) {
            System.out.println(product);
        }
        System.out.println("Product not in Product array");
    }

    public void changeProduct(int id, String name) {
        for (Product product : arrayProduct) {
            if (product.getID() == id) {
                product.setName(name);
            }
        }
    }
    public void changeProduct(int id, int price) {
        for (Product product : arrayProduct) {
            if (product.getID() == id) {
                product.setPrice(price);
            }
        }
    }
    public void changeProduct(int id, String name, int price) {
        for (Product product : arrayProduct) {
            if (product.getID() == id) {
                product.setName(name);
                product.setPrice(price);
            }
        }
    }


    public void display() {
        for (Product product : arrayProduct) {
            System.out.println("ID = " + product.getID() + " , name = " + product.getName() + " , price = " + product.getPrice());
        }
    }

    public void decreaseArray() {
        Collections.sort(arrayProduct, getComparatorThan());
    }

    public void increaseArray() {
        Collections.sort(arrayProduct, getComparatorLess());
    }

    public void changProduct(int id, String name, int price) {
        for (Product product:
             arrayProduct) {
            if (product.getID() == id)
                product.setName(name);
            product.setPrice(price);
        }
    }

    @Override
    public String toString() {
        return "ProductManager{" + "arrayProduct=" + arrayProduct + "}";
    }


    private Comparator<Product> getComparatorThan() {
        return new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() > p2.getPrice()) {
                    return 1;
                } else {
                    if (p1.getPrice() == p2.getPrice()) {
                        return 0;
                    } else
                        return -1;
                }
            }
        };
    }

    private Comparator<Product> getComparatorLess() {
        return new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() < p2.getPrice()) {
                    return 1;
                } else {
                    if (p1.getPrice() == p2.getPrice()) {
                        return 0;
                    } else
                        return -1;
                }
            }
        };
    }

}
