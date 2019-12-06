package payment.gateway.config.configclient.validation;

import org.springframework.stereotype.Component;

@Component("NoValidationImpl")
public class NoValidationImpl implements Validation {
    @Override
    public void validate() {
        System.out.println("No validation");
    }
}