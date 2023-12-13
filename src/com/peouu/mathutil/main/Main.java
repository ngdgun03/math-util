 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.peouu.mathutil.main;

import com.peouu.mathutil.core.MathUtil;

/**
 *
 * @author Windows
 */
public class Main {
    public static void main(String[] args) {
        // test case la 1 tinh huong su dung, xai app hay xai ham ma no bao gom
        // input: data dau vao cu the
        // output dau ra ung voi xu li cua ham/ chuc nang cua app di nhien dung dau vao de xu li
        // kif vong mong ham se tra ve value nao do ung voi input o tren
        // so sanh xem ket qua tra ve co nhu ki vong
  
    long expected =120 ; // ki vong
    int n =5;
    long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " +expected+ " expected");
        System.out.println("5! = " + actual + " actual");
}
  }