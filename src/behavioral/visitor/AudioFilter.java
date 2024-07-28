package behavioral.visitor;

interface AudioFilter {
    void apply(FactSegment segment);
    void apply(FormatSegment segment);
}
