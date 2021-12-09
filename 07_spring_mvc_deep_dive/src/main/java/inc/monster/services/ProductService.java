package inc.monster.services;

import inc.monster.domain.Product;
import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveOrUpdateProduct(Product product);
}
