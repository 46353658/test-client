package payment.gateway.config.configclient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import payment.gateway.config.configclient.validation.Validation;
import payment.gateway.config.configclient.window.Window;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EntryPointTest {

    @Autowired
    Validation validation;

    @Autowired
    Window window;

    @Test
    void subscribe() {
        validation.validate();
    }

    @Test
    void process() { window.check(); }

}