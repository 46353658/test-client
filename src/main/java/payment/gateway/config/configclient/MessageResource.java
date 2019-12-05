package payment.gateway.config.configclient;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import payment.gateway.config.configclient.validation.Validation;

import java.time.LocalTime;

@RefreshScope
@RequestMapping("/rest")
@RestController
public class MessageResource {

    @Value("${startTimeHour}")
    private int startTimeHour;

    @Value("${startTimeMinute}")
    private int startTimeMinute;

    @Value("${endTimeHour}")
    private int endTimeHour;

    @Value("${endTimeMinute}")
    private int endTimeMinute;

    @Autowired
    private Validation validation;

    @Value("${validation: Default Validation}")
    private String xsdValidation;

    @Value("${environment: Default Environment}")
    private String environment;

    @GetMapping("/xsdValidation")
    public String getXsdValidation() {
        return xsdValidation;
    }

    @GetMapping("/validation")
    public void getValidation() {
        validation.validate();
    }

    @GetMapping("/environment")
    public String getEnvironment() {
        return environment;
    }

    @GetMapping("/windowStatus")
    public String getWindowStatus() {
        String response = "";
        LocalTime currentTime = LocalTime.now();
        LocalTime startTime = LocalTime.of(startTimeHour, startTimeMinute, 0,0);
        LocalTime endTime = LocalTime.of(endTimeHour, endTimeMinute, 0,0);
        if ((currentTime.compareTo(startTime) > 0) && (currentTime.compareTo(endTime) < 0)) {
            response = "Processing window open. ";
        } else {
            response = String.format("Processing window closed, please try between %s and %s. ", startTime.toString(), endTime.toString());
        }
        return response.concat(String.format("Your request was received at %s", currentTime));
    }

}
