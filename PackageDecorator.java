public abstract class PackageDecorator implements AdventurePackage {
    protected AdventurePackage decoratedPackage;

    public PackageDecorator(AdventurePackage decoratedPackage) {
        this.decoratedPackage = decoratedPackage;
    }

    public String getDescription() {
        return decoratedPackage.getDescription();
    }

    public double getCost() {
        return decoratedPackage.getCost();
    }
}