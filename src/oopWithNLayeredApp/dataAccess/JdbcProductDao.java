package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        //Sadece database erişim kodları buraya yazılır.SQL
        System.out.println("jdbc ile vt na eklendi");
    }
}
