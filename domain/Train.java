public class Train extends TransportService {
    private double distance;
    private double farePerKm;
    private double railService;

    public Train(String id, double distance, double farePerKm, double railService){
        super(id);
        setDistance(distance);
        setFarePerKm(farePerKm);
        setRailService(railService);

    }
//getters
    public double getDistance(){
        return distance;
    }
    public double getFarePerKm(){
        return farePerKm;
    }
    public double getRailService(){
        return railService;
    }
//setters
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

    public void setRailService(double railService){
        if(!isValid(railService)){
            throw new IllegalArgumentException("rail service must be > 0");
        }
        this.railService = railService;
    }
//metodos
    public boolean isValid(double i){
        return i > 0;
    }
    @Override
    public double calculateFare(){
        return (getDistance()*getFarePerKm())+getRailService();
    }
    
}
