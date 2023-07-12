package ch.noseryoung.sbdemo01.domain.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity //sagt, das die Klass eine entity ist.
@Data //enthält die Annotation @Getter und @Setters
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Product")
public class Product {
    @Id
    @Column(name = "Id")
    private int pruductId;

    @NotBlank(message = "Description must not be empty")
    @Column(name = "Description")
    @Size(min = 5, max = 100)
    private String description;

    @Column(name = "Price")
    @PositiveOrZero(message = "Price must not be negative")
    private double price;

}
