package packageinfo;

public class PackageInfo {
    private final double weight;
    private final double dimensions;
    private final boolean international;
    private final boolean metropolitan;

    public PackageInfo(double weight, double dimensions, boolean international, boolean metropolitan) {
        this.weight = weight;
        this.dimensions = dimensions;
        this.international = international;
        this.metropolitan = metropolitan;	
    }

    public double getWeight() {
        return weight;
    }

    public double getDimensions() {
        return dimensions;
    }

    public boolean isInternational() {
        return international;
    }

    public boolean isMetropolitan() {
        return metropolitan;
    }
}
