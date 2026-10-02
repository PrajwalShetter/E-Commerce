package com.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {
    private int id;
    private String name;
    private int age;
    private String address;

}
