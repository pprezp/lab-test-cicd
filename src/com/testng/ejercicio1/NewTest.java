package com.testng.ejercicio1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;

public class NewTest {
	
	PizzaOrden nuevaOrden;
	
    @BeforeClass
    public void preconditions() {  
    	nuevaOrden = new PizzaOrden();
    }

    @Test
    public void verificaOpcionVeganaDefault() {

    	boolean actualResult = nuevaOrden.getOpcionVeg();
    	boolean expectedResult = false;
    	Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void verificaOpcionVeganaTrue() {
    	nuevaOrden.setOpcionVeg("Y");
    	boolean actualResult = nuevaOrden.getOpcionVeg();
    	boolean expectedResult = true;
    	Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void verificaIngrediente1Default() {
    	String actualResult = nuevaOrden.getIngrediente1();
    	String expectedResult = "";
    	Assert.assertEquals(actualResult, expectedResult);
    }
    
    @Test
    public void verificaOpcionIngrediente1Pimiento() {
    	nuevaOrden.setIngrediente1("a");
    	String actualResult = nuevaOrden.getIngrediente1();
    	String expectedResult = "Pimiento";
    	Assert.assertEquals(actualResult, expectedResult);
    }
    
    @Test
    public void verificaOpcionIngrediente2Hongo() {
    	nuevaOrden.setIngrediente2("b");
    	String actualResult = nuevaOrden.getIngrediente2();
    	String expectedResult = "Hongos";
    	Assert.assertEquals(actualResult, expectedResult);
    }
    
    @Test
    public void verificaOpcionIngrediente3Espinaca() {
    	nuevaOrden.setIngrediente3("c");
    	String actualResult = nuevaOrden.getIngrediente3();
    	String expectedResult = "Espinaca";
    	Assert.assertEquals(actualResult, expectedResult);
    }
    
    @Test
    public void verificaOpcionIngrediente1Peperoni() {
    	nuevaOrden.setIngrediente1("d");
    	String actualResult = nuevaOrden.getIngrediente1();
    	String expectedResult = "Peperoni";
    	Assert.assertEquals(actualResult, expectedResult);
    }
    
    @Test
    public void verificaOpcionInvalidaIngrediente1() {
    	nuevaOrden.setIngrediente1("ASDFG");
    	String actualResult = nuevaOrden.getIngrediente1();
    	String expectedResult = "Opcion_Invalida";
    	Assert.assertEquals(actualResult, expectedResult);
    }
}
