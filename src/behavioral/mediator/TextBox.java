package behavioral.mediator;

public class TextBox extends UIControl{
    private String content;

    public TextBox(AbstractContainer owner) {
        super(owner);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyContainer();
    }
}
