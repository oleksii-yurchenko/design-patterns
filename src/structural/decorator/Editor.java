package structural.decorator;

public class Editor {
    public void openProject(String path) {
        Artefact[] artefacts = {
                new IsMainDecorator(new BaseArtefact("Main")),
                new BaseArtefact("Demo"),
                new IsErrorDecorator(new BaseArtefact("EmailClient")),
                new BaseArtefact("EmailProvider"),
                new IsMainDecorator(new IsErrorDecorator(new BaseArtefact("CustomClient"))),
        };

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
