package structural.decorator;

public class BaseArtefact implements Artefact{
    private String name;

    public BaseArtefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return name;
    }
}
