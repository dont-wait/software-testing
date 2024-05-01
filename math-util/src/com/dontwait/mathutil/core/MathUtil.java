/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dontwait.mathutil.core;

/**
 *
 * @author Sang
 */
public class MathUtil {
    //trong class này cung cấp ra ngoài nhiều hàm xử lí toán học
    //clone class Math của JDK
    //khi nào ta cần xử lí dữ liệu riêng(non-static)
    //hàm thư viện xài chung cho ai đó, ko cần lưu lại trạng thái/giá trị
    //chọn thiết kế là hàm static
    
    //hàm tính giai thừa!!!
    //n! = 1.2.3.4...n
    //ko có giai thừa cho số âm
    //0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa 18 con số 0, vừa kịp đủ cho kiểu long của data Java
    //21 giai thừa tràn kiểu long
    //bài này quy ước tính n! trong khoảng từ 0..20
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        if (n == 0 || n == 1)
            return 1;   //kết thúc cuộc chơi sớm nếu biết những đầu vào đặc biệt
        
        long product = 1; //tích nhân dồn, thuật toán con heo đất
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    
    }//để dành kiểu đệ quy
    public static long getFactorialByUsingRecrution(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        if (n == 0 || n == 1)
            return 1;
        return n * getFactorialByUsingRecrution(n - 1);
    }
}
