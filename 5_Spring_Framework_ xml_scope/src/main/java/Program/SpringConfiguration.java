package Program;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:factory.properties")
public class SpringConfiguration {
    @Bean
    public Japan japan() {
        return new Japan();
    }

    @Bean
    public Germany germany() {
        return new Germany();
    }

    @Bean

    public Factory factory() {
        return new Factory(japan(), germany());
    }

    @Bean
    public Making making() {
        return new Making(factory());
    }

}
