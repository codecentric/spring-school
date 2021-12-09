package inc.monster.product.controllers;

import inc.monster.product.domain.Product;
import inc.monster.product.services.ProductService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping({"/list", "/"})
    public String listProducts(Model model) {

        model.addAttribute("products", productService.listAll());

        return "product/list";
    }

    @GetMapping("/show/{id}")
    public String getProduct(@PathVariable Integer id, Model model) {

        model.addAttribute("product", productService.getById(id));

        return "product/show";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {

        model.addAttribute("product", productService.getById(id));

        return "product/edit";
    }

    @GetMapping("/new")
    public String newProduct(Model model) {

        model.addAttribute("product", new Product());

        return "product/edit";
    }

    @PostMapping
    public String saveOrUpdateProduct(@Valid Product product, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "product/edit";
        }

        Product savedProduct = productService.saveOrUpdate(product);

        return "redirect:/product/show/" + savedProduct.getId();
    }

    // Remember this is not a REST-Api, we are requesting a view from the server
    // The alternative would be to use a <form> with POST in the view
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        productService.delete(id);

        return "redirect:/product/list";
    }

}
