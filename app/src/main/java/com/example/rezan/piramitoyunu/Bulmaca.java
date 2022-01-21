package com.example.rezan.piramitoyunu;

public class Bulmaca {
    private int buyukluk;
    private int[][] sayilar;
    private int[] oynama;

    public Bulmaca(String bulmacaBilgisi){
        int k = 0;
        buyukluk = (int) Math.sqrt(2*bulmacaBilgisi.length()); //bulmacadaki satir sayisi
        oynama = new int[buyukluk]; //her satırda secilen eleman buraya kaydedilecek
        sayilar = new int[buyukluk][];


        for(int i=0; i<buyukluk; i++){
            oynama[i] = -1; //ilklendirme, secilmemis duruma getirildi
            sayilar [i] = new int[i+1]; //her satır için gerekli sütun alanları oluşturuldu, örneğin: 0. satırda 1 , 1. satırda 2 sütun

            //sütunları doldurma
            for(int j=0; j<=i;j++){
                sayilar[i][j] = bulmacaBilgisi.charAt(k) - 48; //ascii'yi integer a çevirmek için - 48 diyoruz
                k++; //iterasyon, bulmacaBilgisi üzerindeki rakamlara sıralı bir biçimde geçiş yaparak ulaşacağız
            }
        }
    }

    public int sayi(int satir, int sutun){
        return sayilar[satir][sutun];
    }

    public int oynananDeger (int satir){
        return oynama[satir];
    }

    public void oyna(int satir, int deger){
        oynama[satir] = deger; //satırdan bir eleman seçildi
    }

    public int getBuyukluk(){
        return buyukluk;
    }
}
