package com.mauricioborges;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class Query implements GraphQLQueryResolver {
    public List<Store> getAllStores() {
        List<Store> stores = Arrays.asList(new Store("1", "first"), new Store("2", "second"));
        return stores;
    }
}