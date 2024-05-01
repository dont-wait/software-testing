/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dontwait.lambda.main;

import com.dontwait.lambda.core.Salutation;

/**
 *
 * @author Sang
 */
public class Main {
    
    public static void main(String[] args) {
        //xài interface kiểu truyền thống - new class Con đã implements Cha
        SalutationVN loiChao = new SalutationVN();
        loiChao.sayHello("Lệ phí đổi ngành 2m350");
        
        //xài cách 2, éo thèm làm class Con implements Cha
        //xài keieur on-the-go, take-away
        //ANONYMOUS CLASS NGHĨA LÀ KHÔNG CẦN TẠO CONCRETE CLASS,
        //CHỈ CẦN NEW VÀ GÕ CODE VÀ CHẤM THÔI MÀ
        
        
        Salutation helloEN = new Salutation() {
            @Override
            public void sayHello(String msg) {
                System.out.println(msg);
            }
        };  //VIP
        helloEN.sayHello("Trường 3 chữ");
        
        //Lambda Expression: code cho hàm abstract
        //gọi nó sau khi code xong
        //loại bỏ lun cái tên hàm
        
        //Salutation helloJP = (String msg) -> {System.out.println(msg);};
        //sửa lại gọn hơn nữa
        //Salutation helloJP = msg -> System.out.println(msg);
        Salutation helloJP = msg -> {
            System.out.println("Lambda thú vị vãi");
            System.out.println(msg);
        };
        
        helloJP.sayHello("Hello, hờ en tờ ai");
    }
}   
