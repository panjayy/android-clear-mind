package com.example.elfari.clearmind.Models;

/**
 * Created by Elfari on 11/9/2017.
 */
public class MySound {
    public int pilihan;
    public String songName;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public MySound(int pilihan,String songName) {
        this.pilihan = pilihan;
        this.songName = songName;
    }

    public int getPilihan() {
        return pilihan;
    }

    public void setPilihan(int pilihan) {
        this.pilihan = pilihan;
    }
}
