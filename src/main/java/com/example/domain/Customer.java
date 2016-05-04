package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by koji on 2016/05/04.
 */
@Data
@AllArgsConstructor
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
}
