package org.launchcode;

public abstract class BaseDisc {
    private String deviceType;
    private double duration;
    private double storageCapacity;
    private double usedStorage;
    private String formatType;
    private String title;

    public BaseDisc(String deviceType, double duration, double storageCapacity, double usedStorage, String formatType, String title) {
        this.deviceType = deviceType;
        this.duration = duration;
        this.storageCapacity = storageCapacity;
        this.usedStorage = usedStorage;
        this.formatType = formatType;
        this.title = title;
    }

    public void jumpForward(int seconds) {
        System.out.println("You've jumped forward " + seconds + "forward.");
    }

    public void jumpBackwards(int seconds) {
        System.out.println("You've jumped forward " + seconds + "backwards.");
    }

    public void writeData(double gB) {
        double storageLeft = storageCapacity - usedStorage;
        if(gB > storageLeft){
            System.out.println("There is not enough memory for that data.");
        } else{
            System.out.println("You've written " + gB + "GB to disk.");
        }
    }

    public void reportFormat() {
        System.out.println(formatType);
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getUsedStorage() {
        return usedStorage;
    }

    public void setUsedStorage(double usedStorage) {
        this.usedStorage = usedStorage;
    }

    public String getFormatType() {
        return formatType;
    }

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}