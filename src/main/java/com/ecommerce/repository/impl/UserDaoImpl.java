package com.ecommerce.repository.impl;

public class UserDaoImpl {

    public boolean userExists(String username) {
        System.out.println("Checking user for login: " + username);
        return true;
    }

}
