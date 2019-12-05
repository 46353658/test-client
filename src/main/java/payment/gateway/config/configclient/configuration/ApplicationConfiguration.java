package payment.gateway.config.configclient.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import payment.gateway.config.configclient.validation.NoValidationImpl;
import payment.gateway.config.configclient.validation.Validation;
import payment.gateway.config.configclient.validation.ValidationImpl;
import payment.gateway.config.configclient.window.ClosedWindowImpl;
import payment.gateway.config.configclient.window.OpenWindowImpl;
import payment.gateway.config.configclient.window.Window;

@Configuration
@RefreshScope
public class ApplicationConfiguration {

    @Bean
    @ConditionalOnProperty(name = "window", havingValue = "ClosedWindowImpl")
    public Window closedWindow() {
        return new ClosedWindowImpl();
    }

    @Bean
    @ConditionalOnProperty(name = "window", havingValue = "OpenWindowImpl")
    public Window openWindow() {
        return new OpenWindowImpl();
    }

    @Bean
    @ConditionalOnProperty(name = "validation", havingValue = "NoValidationImpl")
    public Validation noValidation() {
        return new NoValidationImpl();
    }

    @Bean
    @ConditionalOnProperty(name = "validation", havingValue = "ValidationImpl")
    public Validation validation() {
        return new ValidationImpl();
    }
}
