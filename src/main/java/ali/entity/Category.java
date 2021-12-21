package ali.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable {

    @SequenceGenerator(name = "generator",sequenceName = "CATEGORY_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID",nullable = false)
    private Long id;

    @Column(name = "NAME",nullable = false, length = 50)
    private String name;

    @Column(name = "CATEGORYLEVEL")
    private Long categoryLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TOP_CATEGORY")
    private Category topCategoryId;

    public Category getTopCategoryId() {
        return topCategoryId;
    }

    public void setTopCategoryId(Category topCategoryId) {
        this.topCategoryId = topCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(Long categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categoryLevel=" + categoryLevel +
                ", topCategoryId=" + topCategoryId +
                '}';
    }
}
