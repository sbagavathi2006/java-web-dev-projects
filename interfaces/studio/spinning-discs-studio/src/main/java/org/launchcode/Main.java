package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> tracks = new ArrayList<>();
        tracks.add("Under The Bridge");

        tracks.add("Californication");

        // TODO: Declare and initialize a CD and a DVD object.
        CD californication = new CD("CD Player", 56.24, 654, 463, "MP3","Californication", tracks, "Red Hot Chili Peppers" );
        // TODO: Call each CD and DVD method to verify that they work as expected.

        californication.discInfo();
        californication.spinDisk();
        californication.jumpBackwards(56);
        californication.writeData(8);
    }
}