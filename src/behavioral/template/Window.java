package behavioral.template;

public abstract class Window {
    protected abstract void doClose();

    public void close(){
        System.out.println("Removing the window from the screen");
        doClose();
    }
}
