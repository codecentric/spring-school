package inc.monster.app;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("my")
public class MyProperties {

    /**
     * the magic value
     */
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
