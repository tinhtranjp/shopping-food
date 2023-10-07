package jp.furucrm.shopping.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "food")
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "food_name")
    private String foodName;

    @Column(name = "price")
    private int price;

    @Column(name = "giam_gia")
    private int giamGia;

    @Column(name = "is_free_ship")
    private Boolean isFreeShip;

    @Column(name = "create_date")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "food")
    private Set<OderDetail> ListOderDetail;

    @OneToMany(mappedBy = "food")
    private Set<FoodDetail> ListFoodDetail;
    @OneToMany(mappedBy = "food")
    private Set<RatingFood> ListRatingFood;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    public Boolean getFreeShip() {
        return isFreeShip;
    }

    public void setFreeShip(Boolean freeShip) {
        isFreeShip = freeShip;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<OderDetail> getListOderDetail() {
        return ListOderDetail;
    }

    public void setListOderDetail(Set<OderDetail> listOderDetail) {
        ListOderDetail = listOderDetail;
    }

    public Set<FoodDetail> getListFoodDetail() {
        return ListFoodDetail;
    }

    public void setListFoodDetail(Set<FoodDetail> listFoodDetail) {
        ListFoodDetail = listFoodDetail;
    }

    public Set<RatingFood> getListRatingFood() {
        return ListRatingFood;
    }

    public void setListRatingFood(Set<RatingFood> listRatingFood) {
        ListRatingFood = listRatingFood;
    }
}
