
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DoubleWahyu
 */
public class hitungSHU {
    Connection koneksi;
    public int getuang(String jenis, int jumlah){
        if(jenis == "Uang"){
            int uang = jumlah;
            return uang;
        }
        else{
            int uang = 0;
            return uang;
        }
    }
    public int getbarang(String jenis, int jumlah){
        if(jenis == "Barang"){
            int barang = jumlah;
            return barang;
        }
        else{
            int barang = 0;
            return barang;
        }
    }
    public int getshusimpanan(int simp, int total){
        int hasil, tosim;
        tosim = 32546656;
        hasil = (simp/total)*tosim;
        return hasil;
    }
    public int getshupinjaman(int pinj, int total){
        int hasil, topin;
        topin = 48820044;
        hasil = (pinj/total)*topin;
        return hasil;
    }
    
    public int getprosentasesimpanan(int punyaku){
        int hasil;
        hasil = (punyaku/32546656)*100;
        return hasil;
    }
    
    public int getprosentasepinjaman(int punyaku){
        int hasil;
        hasil = (punyaku/48820044)*100;
        return hasil;
    }
}
