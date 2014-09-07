package accounting_system.di.business.service;

import accounting_system.di.business.domain.Product;

public class ProductServiceImpl implements ProductService {
    private ProductDao productDao;

    public Product getProduct() {
        return productDao.getProduct();
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
}