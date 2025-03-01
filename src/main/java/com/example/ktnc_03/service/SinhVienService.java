package com.example.ktnc_03.service;

import com.example.ktnc_03.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

//    SinhVien sinhVien = new SinhVien();
//    List<SinhVien> list = new ArrayList<>();

    public void update (List<SinhVien> list, SinhVien sinhVien, int index) {
        if (sinhVien == null) {
            throw new IllegalArgumentException("Nhan vien khong duoc de trong");
        }
        list.set(index, sinhVien);
    }

//    public List<SinhVien> getAll () {
//        return list;
//    }
}
