/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.model;

/**
 *
 * @author trung
 */
public class SinhVien {
     private String MaSV, Holot, Ten, Malop,Tenlop,SoDT,Email;

    public SinhVien(String MaSV, String Holot, String Ten, String Malop, String Tenlop, String SoDT, String Email) {
        this.MaSV = MaSV;
        this.Holot = Holot;
        this.Ten = Ten;
        this.Malop = Malop;
        this.Tenlop = Tenlop;
        this.SoDT = SoDT;
        this.Email = Email;
    }

    public SinhVien() {
        super();
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHolot() {
        return Holot;
    }

    public void setHolot(String Holot) {
        this.Holot = Holot;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getMalop() {
        return Malop;
    }

    public void setMalop(String Malop) {
        this.Malop = Malop;
    }

    public String getTenlop() {
        return Tenlop;
    }

    public void setTenlop(String Tenlop) {
        this.Tenlop = Tenlop;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
     
     
}
