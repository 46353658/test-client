package payment.gateway.config.configclient;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import payment.gateway.config.configclient.validation.Validation;

@Component
@RefreshScope
public class EntryPoint {

    private Validation validation;

    @Autowired
    public EntryPoint(@Value("${validation}") String validationBeanName, final BeanFactory beanFactory) {
        this.validation = beanFactory.getBean(validationBeanName, Validation.class);
    }

    public void subscribe() {
        validation.validate();
    }
}
