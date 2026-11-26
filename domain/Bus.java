public class Bus extends TransportService {
    private double staticFare;
    private int passengerNum;

    public Bus(String id,double staticFare, int passengerNum){
        super(id);
        setStaticFare(staticFare);
        setPassengerNum(passengerNum);
    }
    //
    public double getStaticFare(){
        return staticFare;
    }
    public int getPassengerNum(){
        return passengerNum;
    }
    //
    public void setStaticFare(double staticFare){
        if(!isValidFare(staticFare)){
            throw new IllegalArgumentException("static fare must be > 0");
        }
        this.staticFare=staticFare;
    }
    public void setPassengerNum(int passengerNum){
        if(!isValidNum(passengerNum)){
            throw new IllegalArgumentException("passenger num must be > 0");
        }
        this.passengerNum=passengerNum;
    }
    //
    @Override 
    public double calculateFare(){
        return getStaticFare()*getPassengerNum();
    }


    public boolean isValidFare(double i){
        return i>0;
    }
    public boolean isValidNum(int j){
        return j>0;
    }

    
}
