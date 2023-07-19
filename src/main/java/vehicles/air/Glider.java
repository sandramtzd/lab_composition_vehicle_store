package vehicles.air;

import products.IProduct;
import vehicles.Vehicle;

public class Glider extends Vehicle implements IAirVehicle{

    private String gliderType;
    private String liftType;

    public Glider(String gliderType, String liftType, float weight, int maxSpeed, IProduct baseProduct){
        super(weight, maxSpeed, baseProduct);
        this.gliderType = "sailplane";
        this.liftType = "wings";
    }


    public String getGliderType() {
        return gliderType;
    }

    public void setGliderType(String gliderType) {
        this.gliderType = gliderType;
    }

    public String getLiftType(){
        return liftType;
    }

    public void setLiftType(String liftType){
        this.liftType = liftType;
    }
}
