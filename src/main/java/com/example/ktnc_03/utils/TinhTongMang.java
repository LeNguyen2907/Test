package com.example.ktnc_03.utils;

public class TinhTongMang {

    public int tinhTongMangSoNguyen (int [] soNguyen) {

        int sum = 0;
        for (int i: soNguyen) {
            sum += i;
        }
        return sum;
    }
}
