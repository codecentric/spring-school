package inc.monster.controllers;

import inc.monster.domain.Product;
import inc.monster.services.ProductService;
import java.util.Locale;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String listProducts(Model model, Locale locale) {

        model.addAttribute("products", productService.listAllProducts());
        model.addAttribute("locale", locale.toLanguageTag());

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
    public String saveOrUpdateProduct(@Valid Product product, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "productform";
        }
        Product savedProduct = productService.saveOrUpdateProduct(product);
        return "redirect:/product/" + savedProduct.getId();
    }

    @GetMapping("product/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "productform";
    }

    // Remember this is not a REST-Api, we are requesting a view from the server
    // The alternative would be to use a <form> with POST in the view
    @GetMapping("/product/delete/{id}")
    public String delete(@PathVariable Integer id) {
        productService.deleteProduct(id);

        return "redirect:/products";
    }

}
