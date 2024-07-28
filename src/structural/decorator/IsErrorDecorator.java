package structural.decorator;

public class IsErrorDecorator implements Artefact{
    private Artefact artefact;

    public IsErrorDecorator(Artefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return String.format("%s %s", artefact.render(), "[Error]");
    }
}
