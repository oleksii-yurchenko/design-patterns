package behavioral.visitor;

public class ReverbFilter implements AudioFilter {
    @Override
     public void apply(FactSegment segment) {
        System.out.println("Reverb Fact");

    }

    @Override
    public void apply(FormatSegment segment) {
        System.out.println("Reverb Format");

    }
}
