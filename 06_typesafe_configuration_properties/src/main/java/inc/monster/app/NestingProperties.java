package inc.monster.app;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("nesting")
public class NestingProperties {

    private String value;

    private Nested nested;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Nested getNested() {
        return nested;
    }

    public void setNested(Nested nested) {
        this.nested = nested;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static class Nested {

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
}
