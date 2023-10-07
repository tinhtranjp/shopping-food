package jp.furucrm.shopping.entity;

import jakarta.persistence.*;

@Entity(name = "food_detail")
@Table(name = "food_detail")
public class FoodDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "desc")
    private String desc;

    @ManyToOne
    @JoinColumn(name = "food_id")
    private Food food;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
