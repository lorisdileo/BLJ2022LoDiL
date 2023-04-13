package ch.noseryoung.sbdemo01.domain.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity //sagt, das die Klass eine entity ist.
@Data //enthält die Annotation @Getter und @Setters
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Product")
public class Product {
    @Id
    @Column(name = "Id")
    private int pruductId;

    @NonNull
    @Column(name = "Description")
    private String description;

    @Column(name = "Price")
    private double price;

}
