package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        //Sadece database erişim kodları buraya yazılır.SQL
        System.out.println("hibernate ile vt na eklendi");
    }
}
