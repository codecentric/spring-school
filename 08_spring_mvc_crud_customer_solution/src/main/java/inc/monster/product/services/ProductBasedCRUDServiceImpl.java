package inc.monster.product.services;

import inc.monster.common.services.AbstractMapBasedCRUDService;
import inc.monster.product.domain.Product;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class ProductBasedCRUDServiceImpl extends AbstractMapBasedCRUDService<Product> implements ProductService {

    @Override
    protected Map<Integer, Product> loadDomainObjects() {
        Map<Integer, Product> result = new HashMap<>();

        Product product1 = new Product();
        product1.setId(1);
        product1.setDescription("Product 1");
        product1.setPrice(new BigDecimal("12.99"));
        product1.setImageUrl("http://example.com/product1");
        result.put(1, product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setDescription("Product 2");
        product2.setPrice(new BigDecimal("14.99"));
        product2.setImageUrl("http://example.com/product2");
        result.put(2, product2);

        Product product3 = new Product();
        product3.setId(3);
        product3.setDescription("Product 3");
        product3.setPrice(new BigDecimal("34.99"));
        product3.setImageUrl("http://example.com/product3");
        result.put(3, product3);

        Product product4 = new Product();
        product4.setId(4);
        product4.setDescription("Product 4");
        product4.setPrice(new BigDecimal("44.99"));
        product4.setImageUrl("http://example.com/product4");
        result.put(4, product4);

        Product product5 = new Product();
        product5.setId(5);
        product5.setDescription("Product 2");
        product5.setPrice(new BigDecimal("25.99"));
        product5.setImageUrl("http://example.com/product5");
        result.put(5, product5);

        return result;
    }
}
