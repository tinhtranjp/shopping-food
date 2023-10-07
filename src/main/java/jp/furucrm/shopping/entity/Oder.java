package jp.furucrm.shopping.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "oder")
@Table(name = "oder")
public class Oder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "trang_thai")
    private String trangThai;

    @Column(name = "total_price")
    private int total_price;

    @Column(name = "create_date")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @OneToMany(mappedBy = "oder")
    private Set<OderDetail> ListOderDetail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Set<OderDetail> getListOderDetail() {
        return ListOderDetail;
    }

    public void setListOderDetail(Set<OderDetail> listOderDetail) {
        ListOderDetail = listOderDetail;
    }
}
