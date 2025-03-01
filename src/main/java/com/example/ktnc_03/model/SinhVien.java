package com.example.ktnc_03.model;

public class SinhVien {

//    maSV - String , ten - String , tuoi - int, diemTrungBinh - float, kyHoc - int, chuyenNganh - String
    private String maSV;
    private String ten;
    private int tuoi;
    private float dienTrungBinh;
    private int kiHoc;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, int tuoi, float dienTrungBinh, int kiHoc, String chuyenNganh) {
        setMaSV(maSV);
        setTen(ten);
        this.tuoi = tuoi;
        this.dienTrungBinh = dienTrungBinh;
        this.kiHoc = kiHoc;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        if (maSV == null || maSV.isEmpty()) {
            throw new IllegalArgumentException("Ma khong duoc de trong");
        }
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten == null || ten.isEmpty()) {
            throw new IllegalArgumentException("Ten khong duoc de trong");
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getDienTrungBinh() {
        return dienTrungBinh;
    }

    public void setDienTrungBinh(float dienTrungBinh) {
        this.dienTrungBinh = dienTrungBinh;
    }

    public int getKiHoc() {
        return kiHoc;
    }

    public void setKiHoc(int kiHoc) {
        this.kiHoc = kiHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        if (chuyenNganh == null || chuyenNganh.isEmpty()) {
            throw new IllegalArgumentException("Chuyen nganh khong duoc de trong");
        }
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", dienTrungBinh=" + dienTrungBinh +
                ", kiHoc=" + kiHoc +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}
