package behavioral.mediator;

public class UIControl {
    private AbstractContainer owner;

    public UIControl(AbstractContainer owner) {
        this.owner = owner;
    }

    protected void notifyContainer(){
        owner.update(this);
    }
}
