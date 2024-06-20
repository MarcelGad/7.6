package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigmacNew(){
        //Given & When
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Sałata")
                .ingredient("Cebula")
                .sauce("Barbecue")
                .burgers(2)
                .bun("z sezamem")
                .build();
        System.out.println(bigmac);
        //Then
        assertEquals("z sezamem", bigmac.getBun());
        assertEquals(2, bigmac.getBurgers());
        assertEquals("Barbecue", bigmac.getSauce());
        assertEquals(Arrays.asList("Sałata", "Cebula"), bigmac.getIngredients());



    }
}