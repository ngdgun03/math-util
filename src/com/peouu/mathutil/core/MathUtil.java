/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.peouu.mathutil.core;

/**
 *
 * @author Windows
 */
public class MathUtil {
    // trong class nay cung cap cho ai do nhieu ham 
    // clone class Math cua JDK
    // ham thu vien xai chung cho ai do khong can luu lai trang thai gia tri
    //chon thiet ke la ham static
    
    // ham giai thua!!!
    //n! = 1.2.3.4.... n
    // khong co giai thua cho so am
    //0! -1! -1 quy uoc
    // giai thua ham do thi doc dung, tang nhanh ve giá tri
    // 20 iai thua 19 con so 0, vua kip du cho ieu long cua Java
    //21 bi tran kieu long
    public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("Invalid argument. N must be between from 1 to 20");
        if(n==0 || n ==1)
            return 1;
        long product =1; 
        for (int i = 2; i <= n; i++) 
            product *= i;
            return product;
        }
    
}
