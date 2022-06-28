package xyz.codeframeworks.cf.resources;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="RESOURCE_TYPES")
public class ResourceType {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long ID;
    private String name;
}
