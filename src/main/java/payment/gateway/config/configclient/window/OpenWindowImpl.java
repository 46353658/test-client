package payment.gateway.config.configclient.window;

public class OpenWindowImpl implements Window {
    @Override
    public void check() {
        System.out.println("Window is open");
    }
}
