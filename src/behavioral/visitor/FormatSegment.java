package behavioral.visitor;

public class FormatSegment implements Segment {
    @Override
    public void applyFilter(AudioFilter filter) {
        filter.apply(this);
    }
}
