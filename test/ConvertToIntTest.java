/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mengjiao
 */
public class ConvertToIntTest {
    
    private static MainPanel mainPanel;
    private static Method method;
    
    public ConvertToIntTest() {
       mainPanel = new MainPanel(15);
    }
    
    @BeforeClass
    public static void prepare() throws NoSuchMethodException{
        method = MainPanel.class.getDeclaredMethod("convertToInt", int.class);
        method.setAccessible(true);
    }
       
    @Test
    public void convertToIntTestZero() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        int result=(int)method.invoke(mainPanel,0);
        assertEquals(0,result);
    }
    
    @Test
    public void convertToIntTestPositive() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        int result=(int)method.invoke(mainPanel,225);
        assertEquals(225,result);
    }

    /*
    ** when the input is negitive number
    ** it should throw NumberFormatException
    */
    @Test
    public void convertToIntTestNegitive() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        try{
        int result=(int)method.invoke(mainPanel,-1);
        fail("Number Format exception");
        } catch (IllegalAccessException e) {
            fail(e.getMessage());
        } catch (InvocationTargetException e) {}
    }
    
    
  
}
