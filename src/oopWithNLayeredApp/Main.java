package oopWithNLayeredApp;

import oopWithNLayeredApp.business.abstaracts.ProductServices;
import oopWithNLayeredApp.business.concretes.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.concretes.JdbcProductDao;
import oopWithNLayeredApp.entities.concretes.Product;

import java.util.Arrays;

//static tanımlanan metodlarda bellekte devamlı kalan bır referans olusturur. ama dıger turlu nesne olusturulup kullan at yapılır
//Bu sebeple loglama gıbı hep kullanılan ıslemlerde metotlar statıc tanımlanabılır newlenmek zorunda kalınmaz
public class Main {
    public static void main(String[] args) throws Exception {

        Product product1=new Product(1,"Iphone",10);
        //Burada artık newle hangi Dao yapısını gonderırsek orda calısma yapacak

        Logger[] loggers={new DatabaseLogger(),new MailLogger()};
        //ToDo:SPring IoC ile iyi kod haline getirilecek
        ProductServices productServices =new ProductManager(new JdbcProductDao(), Arrays.asList(loggers));
        productServices.add(product1);
    }
}