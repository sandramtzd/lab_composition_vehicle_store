package vehicles.air;

import vehicles.IVehicle;

public interface IAirVehicle extends IVehicle {

    String getLiftType();
    
    void setLiftType (String liftType);
}
