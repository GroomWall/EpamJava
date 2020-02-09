package lesson7.practical;

public class Device {
    private String serialNumber;
    private String manufacturer;
    private double price;

    public Device() {
    }

    public Device(String serialNumber, String manufacturer, double price) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ": serialNumber=" + serialNumber +
                ", manufacturer=" + manufacturer +
                ", price=" + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Device other = (Device)obj;

        if(Double.compare(this.price, other.price) != 0){
            return false;
        }

        if( !this.serialNumber.equals(other.serialNumber)){
            return false;
        }

        return this.manufacturer.equals(other.manufacturer);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long price = Double.doubleToLongBits(this.price);
        result = prime * result + serialNumber.hashCode();
        result = prime * result + manufacturer.hashCode();
        result = prime * result + (int) (price ^ (price >>> 32));
        return result;
    }
}
