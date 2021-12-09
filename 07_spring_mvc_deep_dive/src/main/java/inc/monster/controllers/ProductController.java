package inc.monster.controllers;

import inc.monster.domain.Product;
import inc.monster.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String listProducts(Model model) {

        model.addAttribute("products", productService.listAllProducts());

        return "products";
    }

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable Integer id, Model model) {

        model.addAttribute("product", productService.getProductById(id));

        return "product";
    }

    @GetMapping("/product/new")
    public String newProduct(Model model) {

        model.addAttribute("product", new Product());

        return "productform";
    }

    @PostMapping(value = "/product")
    public String saveOrUpdateProduct(Product product) {

        Product savedProduct = productService.saveOrUpdateProduct(product);

        return "redirect:/product/" + savedProduct.getId();
    }

    @GetMapping("product/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {

        model.addAttribute("product", productService.getProductById(id));

        return "productform";
    }

}
