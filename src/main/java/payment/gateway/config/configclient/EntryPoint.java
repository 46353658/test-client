package payment.gateway.config.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import payment.gateway.config.configclient.validation.Validation;
import payment.gateway.config.configclient.window.Window;

@RefreshScope
@Service
@RestController
public class EntryPoint {

    @Autowired
    private Validation validation;

    @Autowired
    private Window window;

    public void subscribe() {
        validation.validate();
    }

    public void process() {
        window.check();
    }
}
