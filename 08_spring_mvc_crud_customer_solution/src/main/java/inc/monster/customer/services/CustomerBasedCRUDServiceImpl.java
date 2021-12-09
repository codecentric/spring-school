package inc.monster.customer.services;

import static java.util.Arrays.asList;

import inc.monster.common.services.AbstractMapBasedCRUDService;
import inc.monster.customer.domain.Customer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class CustomerBasedCRUDServiceImpl extends AbstractMapBasedCRUDService<Customer> implements CustomerService {

    @Override
    protected Map<Integer, Customer> loadDomainObjects() {
        List<Customer> customers = asList(
                new Customer(1, "Metallverarbeitung Müller", "mueller@example.com", 1234),
                new Customer(2, "Bäckerei Hagedorn", "hagedorn@example.com", 6),
                new Customer(3, "Audi GmbH & Co. KG", "audi@example.com", 65000),
                new Customer(4, "Farbrausch Demo Producer", "farbrausch@example.com", 5),
                new Customer(5, "Volkswagen AG", "vw@example.com", 610076),
                new Customer(6, "Deutsche Post DHL Group", "post@example.com", 497745)
        );
        Map<Integer, Customer> result = new HashMap<>();
        for (Customer customer : customers) {
            result.put(customer.getId(), customer);
        }
        return result;
    }
}
