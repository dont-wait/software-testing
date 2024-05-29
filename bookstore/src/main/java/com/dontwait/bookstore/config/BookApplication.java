/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dontwait.bookstore.config;

import jakarta.ws.rs.ApplicationPath;
import java.awt.print.Book;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author sangn
 */
//Xài web app: LocalHost:6969/bookstore
//Xài web api: LocalHost:6969/bookstore/api
@ApplicationPath("api")
public class BookApplication extends ResourceConfig{
    //đây là hàm main() của API
    //lúc deploy app này lên Tomcat, Tomcat sẽ quét qua 1 lượt các
    //class ở các package, thấy class nào bà con với ResourceConfig
    //thì nó sẽ hiểu rằng:
    //ai mà gọi cái url có /api thì class này sẽ phụ trách!!!
    //mapping giữa url / api với class này(web.xml làm nhiệm vụ tương đương
    //class này chỉ đứng đón có url có / api, chứ thực sự nó không xử lí 
    //data từ DATA và JSON
    //nó là đầu mối để kính chuyển các REQUEST sau /api
    //đến các class tương ứng để xử lí tài nguyên tương ứng đc liệt kê
    //trong cái URL sau /api
    //ví dụ: /api/book: em muốn GET hết cuốn sách trong database
    //ví dụ: /api/order: em muốn GET hết ngân hàng trong DB
    //ví dụ: /api/author/nguyen-nhat-anh: em muuốn GET thông tin tác giả nguyễn nhật ánh
    //có quá trời những xử lí cần có của các API
    //để các class khác làm là phù hợp nhất -> CHUYỀN BANH BẮT ĐẦU
    
    public BookApplication() {
        packages("com.dontwait.bookstore.resource"); //hàm thừa kế từ class Cha ResourceConfig
        //tên các packages cách nhau dấu phẩy để phục vụ các request
        //có url.../api/....
        //đang xài package Cha com.dontwait.bookstore.resource
        //thì 2 thằng con v1 v2 phải tự động ép theo
        
    }
}
