package payment.gateway.config.configclient.validation;

public class NoValidationImpl implements Validation {
    @Override
    public void validate() {
        System.out.println("No validation");
    }
}
