package inc.monster.customer.domain;

import inc.monster.common.domain.DomainObject;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Customer implements DomainObject {

    private Integer id;

    @NotEmpty
    private String name;

    @Email
    @NotEmpty
    private String email;

    @Min(1)
    private int size;

    public Customer() {
    }

    public Customer(Integer id, String name, String email, int size) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.size = size;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
