package inc.monster.app;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeComponent {

    @Value("${my.first.property}")
    private String firstProperty;

    @Value("${my.first.integer}")
    private Integer firstInteger;

    @Value("${my.first.long}")
    private Long firstLong;

    @Value("${my.first.double}")
    private Double firstDouble;

    @Value("${my.second.property}")
    private String secondProperty;

    public String getFirstProperty() {
        return firstProperty;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
