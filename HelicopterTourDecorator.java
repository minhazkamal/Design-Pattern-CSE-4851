public class HelicopterTourDecorator extends PackageDecorator {
    public HelicopterTourDecorator(AdventurePackage decoratedPackage) {
        super(decoratedPackage);
    }

    public String getDescription() {
        return decoratedPackage.getDescription() + ", with helicopter tour";
    }

    public double getCost() {
        return decoratedPackage.getCost() + 500.0;
    }
}
