class Distance {
    protected double distanceInMiles;

    public Distance(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    public void travelTime() {
        double timeInHours = distanceInMiles / 60;
        System.out.println("Time taken to cover " + distanceInMiles + " miles: " + timeInHours + " hours");
    }
}
class DistanceMKS extends Distance {
    public DistanceMKS(double distanceInKilometers) {
        super(distanceInKilometers); 
    }

    @Override
    public void travelTime() {
        double distanceInKilometers = distanceInMiles * 1.60934;
        double timeInSeconds = distanceInKilometers / 100;
        System.out.println("Time taken to cover " + distanceInKilometers + " kilometers: " + timeInSeconds + " seconds");
    }
}

public class Main {
    public static void main(String[] args) {
        Distance distance = new Distance(100);
        distance.travelTime();
        System.out.println();
        DistanceMKS distanceMKS = new DistanceMKS(100); 
        distanceMKS.travelTime();
    }
}