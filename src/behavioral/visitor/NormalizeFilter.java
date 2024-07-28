package behavioral.visitor;

public class NormalizeFilter implements AudioFilter {
    @Override
     public void apply(FactSegment segment) {
        System.out.println("Normalize Fact");

    }

    @Override
    public void apply(FormatSegment segment) {
        System.out.println("Normalize Format");

    }
}
