package com.mauricioborges;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Service;

@Service
public class StoreResolver implements GraphQLResolver<Store> {

    public String getAddress(Store store) {

        return "solving it";
    }
}
