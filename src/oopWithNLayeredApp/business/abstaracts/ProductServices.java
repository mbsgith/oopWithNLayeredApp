package oopWithNLayeredApp.business.abstaracts;

import oopWithNLayeredApp.entities.concretes.Product;

import java.util.List;

public interface ProductServices {
    void add(Product product) throws Exception;
    List<Product> getAll();
}
