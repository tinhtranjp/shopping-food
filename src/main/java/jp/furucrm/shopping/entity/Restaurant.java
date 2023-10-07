package jp.furucrm.shopping.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "restaurant")
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "logo")
    private String logo;

    @Column(name = "title")
    private String title;


    @Column(name = "desc")
    private String desc;


    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "ma_buu_dien")
    private String maBuuDien;

    @Column(name = "tinh")
    private String tinh;

    @Column(name = "dia_chi_1")
    private String diaChi1;

    @Column(name = "dia_chi_2")
    private String diaChi2;

    @Column(name = "create_date")
    private Date createDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaBuuDien() {
        return maBuuDien;
    }

    public void setMaBuuDien(String maBuuDien) {
        this.maBuuDien = maBuuDien;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getDiaChi1() {
        return diaChi1;
    }

    public void setDiaChi1(String diaChi1) {
        this.diaChi1 = diaChi1;
    }

    public String getDiaChi2() {
        return diaChi2;
    }

    public void setDiaChi2(String diaChi2) {
        this.diaChi2 = diaChi2;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
