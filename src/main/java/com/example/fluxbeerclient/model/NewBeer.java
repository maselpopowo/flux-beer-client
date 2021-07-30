package com.example.fluxbeerclient.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewBeer {

    private String beerName;

    private BeerStyle beerStyle;

    private String upc;

    private Integer quantityOnHand;

    private String price;
}
