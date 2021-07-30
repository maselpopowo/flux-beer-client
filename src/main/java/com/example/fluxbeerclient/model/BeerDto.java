package com.example.fluxbeerclient.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;

    private String beerName;

    private BeerStyle beerStyle;

    private String upc;

    private Integer quantityOnHand;

    private BigDecimal price;

    private Integer version;

    private LocalDateTime createdDate;

    private LocalDateTime lastModifiedDate;
}
