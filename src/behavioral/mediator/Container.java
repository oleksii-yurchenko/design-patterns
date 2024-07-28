package behavioral.mediator;

import java.util.Objects;

public class Container extends AbstractContainer{
    private Button btn = new Button(this);
    private CheckBox checkBox = new CheckBox(this);
    private TextBox loginInput = new TextBox(this);
    private TextBox passInput = new TextBox(this);

    @Override
    public void update(UIControl control) {
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
    }
}
