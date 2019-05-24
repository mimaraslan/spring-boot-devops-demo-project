package com.mimaraslan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.mimaraslan.controller.HomeController;

public class JUnitControllerTest {

	@Test
    public void testHomeController() {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals(result, "Hello World!");
    }

}
