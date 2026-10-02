package com.ecommerce.repository.impl;

public class UserDaoImpl {


    public void saveUser(){
        System.out.println("User CRUD -- save user");
    }   

    public boolean userExists(String username) {
        System.out.println("Checking user for login: " + username);
        return true;
    }


}
