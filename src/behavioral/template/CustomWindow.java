package behavioral.template;

public class CustomWindow extends Window{
    @Override
    protected void doClose() {
        System.out.println("Internal window's logic");
    }
}
