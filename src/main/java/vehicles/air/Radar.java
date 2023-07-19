package vehicles.air;

import parts.IPart;
import products.IProduct;

public class Radar implements IPart {
    
    String manufacturer;
    long partNumber;
    
    IProduct baseProduct;

    String radarType;
    
    public Radar(String manufacturer, long partNumber, IProduct baseProduct, String radarType){
        this.manufacturer = manufacturer;
        this.partNumber = partNumber;
        this.baseProduct = baseProduct;
        this.radarType = radarType;
        
    }


    @Override
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public long getPartNumber() {
        return this.partNumber;
    }

    @Override
    public void setPartNumber(long partNumber) {
        this.partNumber = partNumber;
    }

    public IProduct getBaseProduct() {
        return this.baseProduct;
    }

    public void setBaseProduct(IProduct baseProduct) {
        this.baseProduct = baseProduct;
    }

    public String getRadarType() {
        return this.radarType;
    }

    public void setRadarType(String radarType) {
        this.radarType = radarType;
    }

    @Override
    public float getPrice() {
        return this.baseProduct.getPrice();
    }

    @Override
    public long getInventory() {
        return this.baseProduct.getInventory();
    }

    @Override
    public void setPrice(float price) {
        this.baseProduct.setPrice(price);
    }

    @Override
    public void setInventory(long amount) {
        this.baseProduct.setInventory(amount);
    }

    @Override
    public void setTitle(String title) {
        this.baseProduct.setTitle(title);
    }

    @Override
    public String getTitle() {
        return this.baseProduct.getTitle();
    }

    @Override
    public void addInventory(long amount) {
        this.baseProduct.addInventory(amount);
    }

    @Override
    public void removeInventory(long amount) throws Exception {
        this.baseProduct.removeInventory(amount);
    }

}
