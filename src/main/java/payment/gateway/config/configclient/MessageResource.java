package payment.gateway.config.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/rest")
@RestController
public class MessageResource {

    private EntryPoint entryPoint;

    @Autowired
    public MessageResource(EntryPoint entryPoint) {
        this.entryPoint = entryPoint;
    }

    @GetMapping("/validation")
    public void getValidation() {
        entryPoint.subscribe();
    }
}
