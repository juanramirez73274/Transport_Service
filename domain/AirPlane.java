public class AirPlane extends TransportService{
    private double baseFare;
    private double luggageKg;
    private double farePerKg;

    public AirPlane(String id, double baseFare, double luggageKg, double farePerKg){
        super(id);
        setBaseFare(baseFare);
        setLuggageKg(luggageKg);
        setFarePerKg(farePerKg);
    }

    
    public double getBaseFare(){
        return baseFare;
    }
    public double getLuggageKg(){
        return luggageKg;
    }
    public double getFarePerKg(){
        return farePerKg;
    }

    public void setBaseFare(double baseFare){
        if(!isValid(baseFare)){
            throw new IllegalArgumentException("base fare must be > 0");
        }
        this.baseFare=baseFare;
    }

    public void setLuggageKg(double luggageKg){
        if(!isValid(luggageKg)){
            throw new IllegalArgumentException("luggage kg must be > 0");
        }
        this.luggageKg=luggageKg;
    }

    public void setFarePerKg(double farePerKg){
        if(!isValid(farePerKg)){
            throw new IllegalArgumentException("fare per kg must be > 0");
        }
        this.farePerKg=farePerKg;
    }

    public double calculateFare(){
        return (getLuggageKg()*getFarePerKg())+getBaseFare();
    }


    public boolean isValid(double i){
        return i > 0;
    }
    
}
