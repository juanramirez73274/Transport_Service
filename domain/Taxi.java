public class Taxi extends TransportService {
    protected double distance;
    protected double farePerKm;
    protected double baseFare;

    public Taxi(String id, double distance, double farePerKm, double baseFare){
        super(id);
        setDistance(distance);
        setFarePerKm(farePerKm);
        setBaseFare(baseFare);
    }

    public double getDistance(){
        return distance;
    }
    public double getFarePerKm(){
        return farePerKm;
    }
    public double getBaseFare(){
        return baseFare;
    }
    
    public void setDistance(double distance){
        if(!isValid(distance)){
            throw new IllegalArgumentException("distance must be > 0");
        }
        this.distance = distance;
    }

    public void setFarePerKm(double farePerKm){
        if(!isValid(farePerKm)){
            throw new IllegalArgumentException("fare per km must be > 0");
        }
        this.farePerKm = farePerKm;
    }

    public void setBaseFare(double baseFare){
        if(!isValid(baseFare)){
            throw new IllegalArgumentException("base fare can't be < 0");
        }
        this.baseFare=baseFare;
    }

    public boolean isValid(double i){
        return i > 0;
    }
    @Override 
    public double calculateFare(){
        return (getDistance()*getFarePerKm())+getBaseFare();
    }
    
}
