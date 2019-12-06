//package payment.gateway.config.configclient.configuration;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import payment.gateway.config.configclient.EntryPoint;
//import payment.gateway.config.configclient.validation.NoValidationImpl;
//import payment.gateway.config.configclient.validation.Validation;
//import payment.gateway.config.configclient.validation.ValidationImpl;
//import payment.gateway.config.configclient.window.ClosedWindowImpl;
//import payment.gateway.config.configclient.window.OpenWindowImpl;
//import payment.gateway.config.configclient.window.Window;
//
//@Configuration
//@RefreshScope
//public class ApplicationConfiguration {
//
//    @Value("${validation}")
//    private String validationBeanName;
//
//    @Bean
////    @RefreshScope
////    @ConditionalOnProperty(name = "window", havingValue = "ClosedWindowImpl")
//    public Window closedWindow() {
//        return new ClosedWindowImpl();
//    }
//
//    @Bean
////    @RefreshScope
////    @ConditionalOnProperty(name = "window", havingValue = "OpenWindowImpl")
//    public Window openWindow() {
//        return new OpenWindowImpl();
//    }
//
//    @Bean
////    @RefreshScope
////    @ConditionalOnProperty(name = "validation", havingValue = "NoValidationImpl")
//    public Validation noValidation() {
//        return new NoValidationImpl();
//    }
//
//    @Bean
////    @RefreshScope
////    @ConditionalOnProperty(name = "validation", havingValue = "ValidationImpl")
//    public Validation validation() {
//        return new ValidationImpl();
//    }
//
////    @Bean
////    @RefreshScope
////    public EntryPoint entryPoint() {
////        if (validationBeanName.equals("NoValidationImpl")) {
////            return new EntryPoint(noValidation());
////        } else if (validationBeanName.equals("ValidationImpl")) {
////            return new EntryPoint(validation());
////        }
////        return new EntryPoint(noValidation());
////    }
//}
