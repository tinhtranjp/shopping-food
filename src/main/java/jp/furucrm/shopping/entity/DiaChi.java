package jp.furucrm.shopping.entity;

import jakarta.persistence.*;

@Entity(name = "dia_chi")
@Table(name = "dia_chi")
public class DiaChi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ma_buu_dien")
    private String maBuuDien;
    @Column(name = "tinh")
    private String tinh;

    @Column(name = "dia_chi_1")
    private String diaChi1;

    @Column(name = "dia_chi_2")
    private String diaChi2;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
