package org.launchcode;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisk{
    // TODO: Implement your custom interface.
    private ArrayList<String> tracks = new ArrayList<>();
    private String artist;

    public CD(String deviceType, double duration, double storageCapacity, double usedStorage, String formatType, String title, ArrayList<String> tracks, String artist) {
        super(deviceType, duration, storageCapacity, usedStorage, formatType, title);
        this.tracks = tracks;
        this.artist = artist;
    }

    @Override
    public void readData() {
        System.out.println("Let's play a song.");
    }

    @Override
    public void discInfo() {
        System.out.println("Here's some info");
    }

    @Override
    public void skipChapters() {
        System.out.println("You've skipped to another track.");
    }

    @Override
    public void spinDisk() {
        System.out.println("Your CD is spinning between 200 to 500 rpm.");
    }

    public ArrayList<String> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<String> tracks) {
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}