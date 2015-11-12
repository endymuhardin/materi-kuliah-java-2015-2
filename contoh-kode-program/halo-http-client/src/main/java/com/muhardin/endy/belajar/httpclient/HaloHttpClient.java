package com.muhardin.endy.belajar.httpclient;

import org.springframework.web.client.RestTemplate;

public class HaloHttpClient {
    public static void main(String[] x){
        System.out.println("Mengakses HTTP Services");

        String url = "http://jsonplaceholder.typicode.com/users";
        
        RestTemplate client = new RestTemplate();
        
        User[] hasil = client.getForObject(url, User[].class);
        
        for (User u : hasil) {
            tampilkanUser(u);
        }
        
    }

    private static void tampilkanUser(User hasil){
        System.out.println("ID : "+hasil.getId());
        System.out.println("Name : "+hasil.getName());
        System.out.println("Username : "+hasil.getUsername());
        System.out.println("Email : "+hasil.getEmail());
        System.out.println("Address Street : "+hasil.getAddress().getStreet());
        System.out.println("Address Suite : "+hasil.getAddress().getSuite());
        System.out.println("Address City : "+hasil.getAddress().getCity());
        System.out.println("Address Zipcode : "+hasil.getAddress().getZipcode());
        
    }
}
