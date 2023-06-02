package pe.com.bcp.repository.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USER")
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
