package pe.com.bcp.repository.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "TBL_REVIEW")
@Data
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    private Double rating;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User author;

}
