package inc.monster.domain;


import java.math.BigDecimal;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Product {
    private Integer id;

    // Validation with default message
    @Size(min = 10, max = 20)
    // Validation with specific message (no i18n)
    @NotEmpty(message="Bitte Beschreibung angeben")
    private String description;

    // Validation with overridden message in message.properties
    @NotNull
    // If the string can not be converted from String to the target
    // type (here BigDecimal) a message with key 'typeMismatch.price' is shown.
    // See Javadoc in DefaultMessageCodesResolver
    private BigDecimal price;

    private String imageUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
