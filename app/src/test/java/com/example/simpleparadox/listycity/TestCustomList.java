package com.example.simpleparadox.listycity;

import android.app.Activity;
//import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
//import androidx.test.rule.ActivityTestRule;
import android.widget.EditText;
import android.widget.ListView;
//import com.robotium.solo.Solo;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class TestCustomList {

    @Test
    public void testHasCity() {
        ArrayList citiesList = new ArrayList<City>();
        City testCity = new City("Vancouver", "BC");
        citiesList.add(testCity);

        CustomList myList = new CustomList(InstrumentationRegistry.getInstrumentation().getContext(), citiesList);

        assert myList.hasCity(testCity);
    }


}
