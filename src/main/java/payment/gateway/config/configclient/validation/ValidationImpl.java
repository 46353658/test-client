package payment.gateway.config.configclient.validation;

import org.springframework.stereotype.Component;

@Component("ValidationImpl")
public class ValidationImpl implements Validation {
    @Override
    public void validate() {
        System.out.println("Validation");
    }
}
