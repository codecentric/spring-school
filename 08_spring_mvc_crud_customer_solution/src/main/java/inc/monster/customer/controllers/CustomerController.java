package inc.monster.customer.controllers;

import inc.monster.customer.domain.Customer;
import inc.monster.customer.services.CustomerService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/customer")
@Controller
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/list", "/"})
    public String listCustomers(Model model) {
        model.addAttribute("customers", customerService.listAll());
        return "customer/list";
    }

    @GetMapping("/show/{id}")
    public String showCustomer(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.getById(id));
        return "customer/show";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.getById(id));
        return "customer/edit";
    }

    @GetMapping("/new")
    public String newCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/edit";
    }

    @PostMapping
    public String saveOrUpdate(@Valid Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "customer/edit";
        }

        Customer newCustomer = customerService.saveOrUpdate(customer);
        return "redirect:customer/show/" + newCustomer.getId();
    }

    // Remember this is not a REST-Api, we are requesting a view from the server
    // The alternative would be to use a <form> with POST in the view
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        customerService.delete(id);

        return "redirect:/customer/list";
    }
}
