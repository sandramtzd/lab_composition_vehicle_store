package vehicles.air;

import products.IProduct;
import vehicles.Vehicle;

public class Helicopter extends Vehicle implements IAirVehicle{

    private String weaponType;

    private String liftType;

    public Helicopter(String weaponType, String liftType, float weight, int maxSpeed, IProduct baseProduct){
        super(weight, maxSpeed, baseProduct);
        this.weaponType = "bazooka";
        this.liftType = "propeller";

    }


    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String getLiftType() {
        return liftType;
    }

    @Override
    public void setLiftType(String liftType) {
        this.liftType = liftType;
    }
}
