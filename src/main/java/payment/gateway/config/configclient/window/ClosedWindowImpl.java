package payment.gateway.config.configclient.window;

public class ClosedWindowImpl implements Window {
    @Override
    public void check() {
        System.out.println("Window is closed");
    }
}
