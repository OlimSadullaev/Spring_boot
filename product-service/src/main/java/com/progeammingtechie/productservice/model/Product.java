package com.progeammingtechie.productservice.model;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
