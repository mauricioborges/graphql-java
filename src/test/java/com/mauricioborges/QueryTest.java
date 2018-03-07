package com.mauricioborges;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueryTest {

    @Test
    public void getAllStores() {
        assertThat(new Query().getAllStores(), CoreMatchers.notNullValue());
    }
}