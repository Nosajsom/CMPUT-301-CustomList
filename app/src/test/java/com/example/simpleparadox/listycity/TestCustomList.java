package com.example.simpleparadox.listycity;

import androidx.test.platform.app.InstrumentationRegistry;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestCustomList {

    @Test
    public void testHasCity(){
        ArrayList citiesList = new ArrayList<City>();
        City testCity = new City("Vancouver", "BC");
        citiesList.add(testCity);

        CustomList myList = new CustomList(InstrumentationRegistry.getInstrumentation().getContext(), citiesList);

        assert myList.hasCity(testCity);
    }

}
