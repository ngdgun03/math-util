/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.peouu.mathutil.test.core;


import com.peouu.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


/**
 *
 * @author Windows
 */
// cau lenh nay cua Junit bao hieu rang can loop qua tap data de lay cap data input/expected vao ham test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    // ham nay tra ve mang 2 chieu tra ve gom nhieu cap Expected|Input
    @Parameterized.Parameters
   public static Object[][] initData(){
       return new Integer[][]{
           {0, 1},
           {1, 1},
           {2, 2},
           {3, 6},
           {4, 24},
           {5, 120},
       };

   }
    // gia su loop qua tung dong cua mang ta van can gan tung value cua cot
   // vao bien tuong ung input,expected de lat feed cho ham
   @Parameterized.Parameter(value = 0) // value = 0 la map voi mang data
   public int n;// bien map voi value cua cot 0 cua mang
   @Parameterized.Parameter(value = 1)
   public long expected; // kieu long vi gia tri tra ve cua ham getF() la long
   @Test  
   public void testGetFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
    
}
