package com.example.fluxbeerclient.model;

import java.util.List;

public class BeerPage {

    private List<BeerDto> content;

    private Pageable pageable;

    private Integer totalPages;

    private Boolean last;

    private Integer totalElements;

    private Integer size;

    private Integer number;

    private Integer numberOfElements;

    private Sort sort;

    private Boolean first;
}
