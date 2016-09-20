package com.brainacad.lab2_7_1_lab2_7_5;

/**
 * Created by Alex on 9/20/2016.
 */
public class Device {

    public String manufacturer;
    protected float price;
    protected String serialNumber;

    public Device() {
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public float getPrice() {
        return price;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString(){
        return "Device:" + " manufacturer = " + manufacturer + ", price = " + price + ", serial nmber =" + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (manufacturer != null ? !manufacturer.equals(device.manufacturer) : device.manufacturer != null)
            return false;
        return serialNumber != null ? serialNumber.equals(device.serialNumber) : device.serialNumber == null;

    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        return result;
    }
}



class Monitor extends Device{

    protected int resolutionX;
    protected int resolutionY;

    public Monitor(){

    }

    public int getResolutionX() {
        return resolutionX;
    }
    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }
    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString(){
    return "Monitor:" + " manufacturer = " + manufacturer + ", price = " + price + ", serial nmber ="
            + serialNumber + ", X = " + resolutionX + ", Y = " + resolutionY;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if ((resolutionX != ((Monitor)o).resolutionX) ||(resolutionY != ((Monitor) o).resolutionY) ||
                (manufacturer != ((Monitor) o).manufacturer) || (price != ((Monitor) o).price)
                || (serialNumber != ((Monitor) o).serialNumber)) return  false;
        return true;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + manufacturer.hashCode();
        result = 31 * result + Float.floatToIntBits(price);
        result = 31 * result + serialNumber.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}



class EthernetAdapter extends Device{

    protected int speed;
    protected String mac;

    public EthernetAdapter(){

    }

    public int getSpeed() {
        return speed;
    }
    public String getMac() {
        return mac;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString(){
        return "EthernetAdapter:" + " manufacturer = " + manufacturer + ", price = " + price + ", serial nmber ="
                + ", speed = " + speed + "mac: " + mac;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if ((speed != ((EthernetAdapter)o).speed) ||(mac != ((EthernetAdapter) o).mac) ||
                (manufacturer != ((EthernetAdapter) o).manufacturer) || (price != ((EthernetAdapter) o).price)
                || (serialNumber != ((EthernetAdapter) o).serialNumber)) return  false;
        return true;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + manufacturer.hashCode();
        result = 31 * result + Float.floatToIntBits(price);
        result = 31 * result + serialNumber.hashCode();
        result = 31 * result + speed;
        result = 31 * result + mac.hashCode();
        return result;
    }
}