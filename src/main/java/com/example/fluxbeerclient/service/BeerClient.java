package com.example.fluxbeerclient.service;

import com.example.fluxbeerclient.model.BeerDto;
import com.example.fluxbeerclient.model.BeerPage;
import com.example.fluxbeerclient.model.BeerStyle;
import com.example.fluxbeerclient.model.NewBeer;
import org.springframework.web.reactive.function.client.ClientResponse;
import reactor.core.publisher.Mono;

public interface BeerClient {

    Mono<BeerPage> list(Integer pageNumber, Integer pageSize, String beerName,
                        BeerStyle beerStyle, Boolean showInventoryOnHand);

    ClientResponse create(NewBeer newBeer);

    Mono<BeerDto> getById(String id, Boolean showInventoryOnHand);

    ClientResponse update(String id, NewBeer newBeer);

    ClientResponse delete(String id);

    Mono<BeerDto> getByUpc(String upc);
}
