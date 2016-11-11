/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mengjiao
 */
public class CellTest {
    
    public CellTest() {
    }
    
    /*
    *when the text is "X"
    */
    @Test
    public void toStringTestAlive() {
        Cell cell = new Cell(true);
        String result="X";
        assertEquals(result,cell.toString());
    }
    
    /*
    *when the text is "."
    */
    @Test
    public void toStringTestDead() {
        Cell cell = new Cell(false);
        String result=".";
        assertEquals(result,cell.toString());
    }
    
    /*
    *when the text is " "
    */
    @Test
    public void toStringTestAliveThenDead() {
        Cell cell = new Cell(true);
        cell.setAlive(false);
        String result=".";
        assertEquals(result,cell.toString());
    }
    
    
    
}
