package behavioral.visitor;

public class ReduceNoiseFilter implements AudioFilter {
    @Override
     public void apply(FactSegment segment) {
        System.out.println("Reduce noise Fact");

    }

    @Override
    public void apply(FormatSegment segment) {
        System.out.println("Reduce noise Format");

    }
}
