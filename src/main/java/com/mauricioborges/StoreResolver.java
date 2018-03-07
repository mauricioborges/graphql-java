package com.mauricioborges;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Service;

@Service
public class StoreResolver implements GraphQLResolver<Store> {

    public String getOneLineAddress(Store store) {
        Address address1 = new Address("street 1", 123, "one city");
        return address1.toString();
    }
}
