package accounting_system.di.dataaccess;

import accounting_system.di.business.domain.Product;
import accounting_system.di.business.service.ProductDao;

public class ProductDaoImpl implements ProductDao {
    public Product getProduct() {
        return new Product("ƒeƒXƒg", 100);
    }
}
