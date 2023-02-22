public class SpaServiceDecorator extends PackageDecorator {
    public SpaServiceDecorator(AdventurePackage decoratedPackage) {
        super(decoratedPackage);
    }

    public String getDescription() {
        return decoratedPackage.getDescription() + ", with spa service";
    }

    public double getCost() {
        return decoratedPackage.getCost() + 200.0;
    }
}