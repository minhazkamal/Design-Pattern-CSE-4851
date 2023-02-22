public class AdventurePackageFactory {
    public AdventurePackage createPackage(String packageName) {
        if (packageName.equals("hiking")) {
            return new HikingPackage();
        } else if (packageName.equals("rock climbing")) {
            return new RockClimbingPackage();
        } else if (packageName.equals("whitewater rafting")) {
            return new WhitewaterRaftingPackage();
        } else {
            throw new IllegalArgumentException("Invalid package name");
        }
    }
}