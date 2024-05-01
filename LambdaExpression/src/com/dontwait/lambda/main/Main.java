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
        loiChao.sayHello();
        
        //xài cách 2, éo thèm làm class Con implements Cha
        //xài keieur on-the-go, take-away
        //ANONYMOUS CLASS NGHĨA LÀ KHÔNG CẦN TẠO CONCRETE CLASS,
        //CHỈ CẦN NEW VÀ GÕ CODE VÀ CHẤM THÔI MÀ
        
        
        Salutation helloEN = new Salutation() {
            @Override
            public void sayHello() {
                System.out.println("Trường ba chữ... RUN");
            }
        };  //VIP
        helloEN.sayHello();
        
        //vì chỉ có 1 hàm trong interface, và cần có code cho hàm này khi xài
        //dù là anonymous hay làm class riêng
        //vì chỉ có 1 hàm duy nhất, mà lại cần code/implement, tại sao
        //ko tập trung vào code, mà mắc mớ viết cả tên hàm làm chi
        //rút gọn từ class riêng bẻ thành anonymous, bớt đc tên class
        //                                           bớt lun tên hàm cho gọn -> Lambda Expression
        //chỉ còn cái dây nịt - code của hàm mà hoy
        //chỉ đc xài cái dây nịt - lambda ex - khi chơi với Functional Interface
        //Interface chỉ có 1 hàm
        
        //chào bằng tiếg Hàn, Nhật,...
        //c1: class rời rạc SalutationJP viết code
        //c2: on the go = anonymous
        //c3: lambda
        
        Salutation helloJP = () -> System.out.println("Say hen tờ ai!!!");
        helloJP.sayHello();
    }
}
