package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class DVD extends BaseDisc implements OpticalDisk {
    // TODO: Implement your custom interface.
    private ArrayList<String> chapters = new ArrayList<>();
    private ArrayList<String> specialFeatures = new ArrayList<>();
    private ArrayList<ArrayList<String>> menu = new ArrayList<>();
    private HashMap<String, ArrayList<String>> visuals = new HashMap<>();
    private String director;

    public DVD(String deviceType, double duration, double storageCapacity, double usedStorage, String formatType, String title, ArrayList<String> chapters, ArrayList<String> specialFeatures, ArrayList<ArrayList<String>> menu, HashMap<String, ArrayList<String>> visuals, String director) {
        super(deviceType, duration, storageCapacity, usedStorage, formatType, title);
        this.chapters = chapters;
        this.specialFeatures = specialFeatures;
        this.menu = menu;
        this.visuals = visuals;
        this.director = director;
    }

    public void play() {
        System.out.println("Your movie is playing.");
    }

    public void skipToAction() {
        System.out.println("Super cool action sequence incoming.");
    }

    public void enableCaptions() {
        System.out.println("Subtitles on.");
    }

    @Override
    public void readData() {
        System.out.println("Data is being read.");
    }

    @Override
    public void discInfo() {
        System.out.println("discInfo");
    }

    @Override
    public void skipChapters() {
        System.out.println("You have skipped to the next chapter.");
    }

    @Override
    public void spinDisk() {
        System.out.println("Disk is spinning at 570 to 1600rpm");
    }

    public ArrayList<String> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<String> chapters) {
        this.chapters = chapters;
    }

    public ArrayList<String> getSpecialFeatures() {
        return specialFeatures;
    }


    public void setSpecialFeatures(ArrayList<String> specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public ArrayList<ArrayList<String>> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<ArrayList<String>> menu) {
        this.menu = menu;
    }

    public HashMap<String, ArrayList<String>> getVisuals() {
        return visuals;
    }

    public void setVisuals(HashMap<String, ArrayList<String>> visuals) {
        this.visuals = visuals;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}