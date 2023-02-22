public class Main {

  public static void main(String[] args) {
    AdventurePackageFactory factory = new AdventurePackageFactory();
    AdventurePackage hikingPackage = factory.createPackage("hiking");
    hikingPackage = new HelicopterTourDecorator(hikingPackage);
    hikingPackage = new SpaServiceDecorator(hikingPackage);
    System.out.println(hikingPackage.getDescription() + " - $" + hikingPackage.getCost());
  }
}