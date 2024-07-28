package behavioral.mediator2;

import java.util.Objects;

public class Container{
    private Button btn = new Button();
    private CheckBox checkBox = new CheckBox();
    private TextBox loginInput = new TextBox();
    private TextBox passInput = new TextBox();


    public Container() {
        checkBox.addEventHandler(this::update);
        loginInput.addEventHandler(this::update);
        passInput.addEventHandler(this::update);
    }

    public void update() {
        var isValid = !Objects.equals(loginInput.getContent(), "")
                && !Objects.equals(passInput.getContent(),"")
                && checkBox.isChecked();

        btn.setEnabled(isValid);
    }

    public void simulate(){
        loginInput.setContent("Alex");
        passInput.setContent("test");
        checkBox.setChecked(true);

        System.out.println(btn.isEnabled());

        loginInput.setContent("Alex");
        passInput.setContent("");
        checkBox.setChecked(true);

        System.out.println(btn.isEnabled());
    }
}
