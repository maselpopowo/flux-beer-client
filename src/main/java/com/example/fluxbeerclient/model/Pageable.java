package com.example.fluxbeerclient.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Pageable {

    private Sort sort;

    private Integer offset;

    private Integer pageNumber;

    private Integer pageSize;

    private Boolean paged;

    private Boolean unpaged;
}
