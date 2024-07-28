package behavioral.mediator;

public class CheckBox extends UIControl{
    private boolean isChecked;

    public CheckBox(AbstractContainer owner) {
        super(owner);
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
        notifyContainer();
    }
}
