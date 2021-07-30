package com.example.fluxbeerclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sort {

    private Boolean sorted;

    private Boolean unsorted;
}
