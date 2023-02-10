package oopWithNLayeredApp.business.concretes;

import oopWithNLayeredApp.business.abstaracts.ProductServices;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.abstaracts.ProductDao;
import oopWithNLayeredApp.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductServices {
    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao,List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception {
        //iş kuralları
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }

        /*JdbcProductDao jdbcProductDao=new JdbcProductDao();
        jdbcProductDao.add(product);*/
        //ProductDao productDao=new JdbcProductDao();
        productDao.add(product);
        for(Logger logger:loggers){
            logger.log(product.getName());
        }
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
