package jp.furucrm.shopping.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;

@Entity(name = "users")
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "katakana")
    private String katakana;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "fax")
    private String fax;

    @Column(name = "gioi_tinh")
    private String gioiTinh;

    @Column(name = "nam_sinh")
    private Date namSinh;

    @Column(name = "chap_nhan_tin")
    private Boolean chapNhanTin;
    @Column(name = "create_date")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roles;

    @OneToMany(mappedBy = "user")
    private Set<DiaChi> ListDiaChi;


    @OneToMany(mappedBy = "user")
    private Set<Oder> ListOder;

    @OneToMany(mappedBy = "user")
    private Set<RatingFood> ListRatingFood;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getKatakana() {
        return katakana;
    }

    public void setKatakana(String katakana) {
        this.katakana = katakana;
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public Boolean getChapNhanTin() {
        return chapNhanTin;
    }

    public void setChapNhanTin(Boolean chapNhanTin) {
        this.chapNhanTin = chapNhanTin;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Set<DiaChi> getListDiaChi() {
        return ListDiaChi;
    }

    public void setListDiaChi(Set<DiaChi> listDiaChi) {
        ListDiaChi = listDiaChi;
    }

    public Set<Oder> getListOder() {
        return ListOder;
    }

    public void setListOder(Set<Oder> listOder) {
        ListOder = listOder;
    }

    public Set<RatingFood> getListRatingFood() {
        return ListRatingFood;
    }

    public void setListRatingFood(Set<RatingFood> listRatingFood) {
        ListRatingFood = listRatingFood;
    }
}
