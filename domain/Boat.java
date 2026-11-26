public class Boat extends Taxi{
    private double boardingFare;

    public Boat(String id, double distance, double farePerKm, double baseFare, double boardingFare){
        super(id, distance, farePerKm, baseFare);
        setBoardingFare(boardingFare);
    }

    public double getBoardingFare(){
        return boardingFare;
    }

    public void setBoardingFare(double boardingFare){
        if(!super.isValid(boardingFare)){
            throw new IllegalArgumentException("boarding fare must be > 0");
        }
        this.boardingFare=boardingFare;
    }
    @Override 
    public double calculateFare(){
        return super.calculateFare()+getBoardingFare();
    }
}
