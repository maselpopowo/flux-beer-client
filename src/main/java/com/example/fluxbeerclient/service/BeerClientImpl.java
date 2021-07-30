package com.example.fluxbeerclient.service;

import com.example.fluxbeerclient.model.BeerDto;
import com.example.fluxbeerclient.model.BeerPage;
import com.example.fluxbeerclient.model.BeerStyle;
import com.example.fluxbeerclient.model.NewBeer;
import org.springframework.web.reactive.function.client.ClientResponse;
import reactor.core.publisher.Mono;

public class BeerClientImpl implements BeerClient {
    @Override
    public Mono<BeerPage> list(Integer pageNumber, Integer pageSize, String beerName,
                               BeerStyle beerStyle, Boolean showInventoryOnHand) {
        return null;
    }

    @Override
    public ClientResponse create(NewBeer newBeer) {
        return null;
    }

    @Override
    public Mono<BeerDto> getById(String id, Boolean showInventoryOnHand) {
        return null;
    }

    @Override
    public ClientResponse update(String id, NewBeer newBeer) {
        return null;
    }

    @Override
    public ClientResponse delete(String id) {
        return null;
    }

    @Override
    public Mono<BeerDto> getByUpc(String upc) {
        return null;
    }
}
