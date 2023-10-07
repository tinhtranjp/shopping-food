package jp.furucrm.shopping.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name = "category")
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_cate")
    private String nameCate;

    @Column(name = "title")
    private String title;

    @Column(name = "desc")
    private String desc;

    @Column(name = "link_img")
    private String linkImg;

    @Column(name = "the_loai")
    private String theLoai;


    @OneToMany(mappedBy = "category")
    private Set<Food> ListFood;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCate() {
        return nameCate;
    }

    public void setNameCate(String nameCate) {
        this.nameCate = nameCate;
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

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public Set<Food> getListFood() {
        return ListFood;
    }

    public void setListFood(Set<Food> listFood) {
        ListFood = listFood;
    }
}
