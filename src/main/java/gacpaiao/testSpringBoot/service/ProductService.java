package gacpaiao.testSpringBoot.service;

import java.util.Collection;
import gacpaiao.testSpringBoot.model.Product;

public interface ProductService {
    public abstract void createProduct(Product product);
    public abstract void updateProduct(String id, Product product);
    public abstract void deleteProduct(String id);
    public abstract Collection<Product> getProduct();
}
