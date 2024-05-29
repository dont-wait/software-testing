/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.dontwait.mathutil.test.core;

import com.dontwait.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Sang
 */
//câu lệnh này của JUnit báo hiệu rằng sẽ cần lôop qua tập data để
//lấy cặp data input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class) 
public class MathUtilDDTTest {

    //ta sẽ trả về mảng 2 chiều, gồm nhiều cặp Expected | Input
    @Parameterized.Parameters   //sau cú này JDK sẽ chạy loop qua từng dòng mảng
                                //để lấy ra từng cặp I/E
    //tên hàm không quan trọng, quan trọng là @
    public static Object[][] initData() {
        return new Integer[][]{
           //input, expected
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }
    
    //giả sử loop qua từng dòng của mảng, ta vẫn cần gán value của cột
    //vào biểu tượng từng input, expected lát hồi feed cho hàm
    
    @Parameterized.Parameter(value = 0)
    public int n; //biến map với value cột 0 của mảng
   
    @Parameterized.Parameter(value = 1)
    public long expected; //kiểu long giá trị trả về của hàm GetF() 
                          //là long
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected , MathUtil.getFactorial(n));    //tui mún 1! = 1

    }
}
