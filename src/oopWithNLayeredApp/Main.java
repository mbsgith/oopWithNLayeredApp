package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//static tanımlanan metodlarda bellekte devamlı kalan bır referans olusturur. ama dıger turlu nesne olusturulup kullan at yapılır
//Bu sebeple loglama gıbı hep kullanılan ıslemlerde metotlar statıc tanımlanabılır newlenmek zorunda kalınmaz
public class Main {
    public static void main(String[] args) throws Exception {

        Product product1=new Product(1,"Iphone",10);
        //Burada artık newle hangi Dao yapısını gonderırsek orda calısma yapacak

        Logger[] loggers={new DatabaseLogger(),new MailLogger()};
        ProductManager productManager=new ProductManager(new JdbcProductDao(), Arrays.asList(loggers));
        productManager.add(product1);
    }
}