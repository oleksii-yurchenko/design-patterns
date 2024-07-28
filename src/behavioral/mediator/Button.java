package behavioral.mediator;

public class Button extends UIControl{
    private boolean isEnabled;

    public Button(AbstractContainer owner) {
        super(owner);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
