package pe.com.bcp.repository.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TBL_ITEM")
@Data
public class Item {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 100)
    private String title;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    Set<Review> reviews = new HashSet<>();

}
