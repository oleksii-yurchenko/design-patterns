package structural.decorator;

public class IsMainDecorator implements Artefact{
    private Artefact artefact;

    public IsMainDecorator(Artefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return String.format("%s %s", artefact.render(), "[Main]");
    }
}
