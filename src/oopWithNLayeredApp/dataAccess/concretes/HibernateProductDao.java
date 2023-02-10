package oopWithNLayeredApp.dataAccess.concretes;

import oopWithNLayeredApp.dataAccess.abstaracts.ProductDao;
import oopWithNLayeredApp.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product){
        //Sadece database erişim kodları buraya yazılır.SQL
        System.out.println("hibernate ile vt na eklendi");
    }
}
