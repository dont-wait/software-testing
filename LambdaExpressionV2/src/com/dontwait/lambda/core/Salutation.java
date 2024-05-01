/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dontwait.lambda.core;

/**
 *
 * @author Sang
 */
@FunctionalInterface    //loại Interface chỉ có duy nhất 1 hàm abstract
public interface Salutation {   //vì chỉ có 1 hàm, sau này khi new()
                                //vùng ram chỉ có 1 hàm, dọn mẹ tên hàm
                                //vì ko có sự nhầm lẫn giữa hàm này và hàm kia
                                //LAMBDA EXPESSION CHỈ ĐC SỬ DỤNG
                                //KHI CHƠI VỚI INTERFACE MÀ CHỈ CÓ 1 HÀM DUY NHẤT
    public void sayHello(String msg);

}
