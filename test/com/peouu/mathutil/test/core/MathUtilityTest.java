/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.peouu.mathutil.test.core;

import com.peouu.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Windows
 */
public class MathUtilityTest {
  // day la class se su dung cac ham cua thu vien/framework Junit
    // de kiem thu, kiem tra code chinh - ham tinh Giai thua bên core 
    // viet code de test code
// có quy tac dat ten ham kiem thu
    // thuong se ns den muc dich cua case/ tinh huong
    //  tinh huong xai ham theo kieu thanh cong hoac that bai
    
    //ham duoi day la tinh huong test  ham chay thanh cong tra ve well
    //@test Junit se phoi hop voi JVM de chay ham nay
    //@Test phia hau truong chinh la public static void main()
  // co nhieu test ung voi nhieu case khac nhau de kiem thu ham tinh 
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n =0; // test thu tinh huong tu te dau vao
        long exptected =1;//hy vong 0!=1
        //long actual = ;// goi ham can test bên core
        long actual = MathUtil.getFactorial(n);
        
        // so sanh expected vs actual
        Assert.assertEquals(exptected, actual);
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(120, MathUtil.getFactorial(6));

        
        
    }
    // ham so sanh 2 gia tri nao do giong nhau
    // neu giong nhau -> mau xanh code ngon it nhat cho case dang test
    // neu khong giong nhau -> mau do ham y expected va actual khong giong nhau
 
    // ham getF() ta thiet ke co 2 tinh huong xu li
    //1.dua data tu te trong 0 den 20 tinh dung dc n! -done
    //2. dua data vao sai thiet ke nem ra ngoai le
    // kì von ngoai le khi xuat hien n<0  || n>20
    
    // neu n sai va ham nem ra ngoai le
    // ham chay dung nhu thiet ke
    // neu ham nhan n<0 va n>20 khong nem ra ngoai le -> sai ki vong mau do
   
    // test case:
    // input -5
    //excepted illegaArgumentException xuat hien
    //assertEquals() khong dung d so sanh 2 ngoai le
    // equals la bang nhau hay khong tren value
    
    
    // tesst do do ham nem ngoai le nhung khong phai ngoai le k vong
//    @Test(expected = NumberFormatException.class )
//    public void testGetFactorialGivenWrongArgumentThrowsException(){
//         MathUtil.getFactorial(-5);// ham @Test nem ngoai le Number format
//    }
      @Test(expected = IllegalArgumentException.class )
    public void testGetFactorialGivenWrongArgumentThrowsException(){
         MathUtil.getFactorial(-5);// ham @Test nem ngoai le Number format
    }
    // cach khac de bat ngoai le xuar hien
    // dung lambda
    // Test case: ham se nem ve ngoai le neu nhan vao 21
     @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVesion(){
      //  Assert.assertThrows(ngoai le muon so sanh, doan code muon ghi chu)
         Assert.assertThrows(IllegalArgumentException.class, 
                 () -> {
                 MathUtil.getFactorial(-5);
                 });
      //MathUtil.getFactorial(-5);// ham @Test nem ngoai le Number format
    
    }
// cach 3: Xem ham co nem ve ngoai le khong khi n ngoai le
 @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
     try {
         MathUtil.getFactorial(-5);
     } catch (Exception e) {
         // bat try-catch Jnit se xanh do chu dong kiem soat ngoai le
         // nhung khong chac ngoai le minh can co xuat hien hay khong
         // co doan code kiem soat dung ngoai le IllegaArgumentException
         Assert.assertEquals("Invalid argument. N must be between from 1 to 20", e.getMessage());
     }
    }

    
}

        
    

