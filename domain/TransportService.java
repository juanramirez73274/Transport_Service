public abstract class TransportService{
    protected String id;

    public TransportService(String id){
        setId(id);
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        if(!isValidId(id)){
            throw new IllegalArgumentException("id can't be null or empty moreover id must match with numbers 0-9");
        }
        this.id = id;
    }

    public abstract double calculateFare();

    public boolean isValidId(String id){
        return id != null && !id.trim().isEmpty() && id.matches("^[0-9]+$");
    }
}