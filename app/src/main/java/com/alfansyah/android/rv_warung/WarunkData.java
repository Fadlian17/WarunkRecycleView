package com.alfansyah.android.rv_warung;

import java.util.ArrayList;

public class WarunkData {
    public static String[][] data = new String[][]{
            {"Warung Tegal","Jenis Warung Makan Indonesia 1","https://cdn2.boombastis.com/wp-content/uploads/2016/03/warteg.jpg"},
            {"Restoran Padang","Jenis Warung Makan Indonesia 2","https://cdn2.boombastis.com/wp-content/uploads/2016/03/rumah-makan-padang.jpg"},
            {"Nasi Goreng dan Bakmi","Jenis Warung Makan Indonesia 3","https://cdn2.boombastis.com/wp-content/uploads/2016/03/Nasi-Goreng-dan-Bakmi.jpg"},
            {"Angkringan","Jenis Warung Makan Indonesia 4","https://cdn2.boombastis.com/wp-content/uploads/2016/03/angkringan.jpg"},
            {"Warung Kopi","Jenis Warung Makan Indonesia 5","https://cdn2.boombastis.com/wp-content/uploads/2016/03/warung-kopi.jpg"},
            {"Sate Madura","Jenis Warung Makan Indonesia 6","https://cdn2.boombastis.com/wp-content/uploads/2016/03/Warung-sate.jpg"},
            {"Kedai Pecel dan Lalapan","Jenis Warung Makan Indonesia 7","https://cdn2.boombastis.com/wp-content/uploads/2016/03/Lalapan.jpg"}
    };

    public static ArrayList<Warunk> getListData(){
        Warunk warunk = null;
        ArrayList<Warunk> list = new ArrayList<>();
        for (String[] aData : data){
            warunk = new Warunk();
            warunk.setName(aData[0]);
            warunk.setRemarks(aData[1]);
            warunk.setPhoto(aData[2]);

            list.add(warunk);
        }
        return list;
    }
}
