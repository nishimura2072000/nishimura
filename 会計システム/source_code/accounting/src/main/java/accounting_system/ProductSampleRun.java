package accounting_system;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import accounting_system.di.business.domain.Product;
import accounting_system.di.business.service.ProductService;

public class ProductSampleRun {

    public static void main(String[] args) {
        ProductSampleRun productSampleRun = new ProductSampleRun();
        productSampleRun.execute();
    }

    public void execute() {
        BeanFactory ctx = new ClassPathXmlApplicationContext(
                "/accounting_system/config/applicationContext.xml");
        ProductService productService = ctx.getBean(ProductService.class);
        Product product = productService.getProduct();
        System.out.println(product);
    }
}