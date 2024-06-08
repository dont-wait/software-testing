/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dontwait.bookstore.resource.v2;

import com.dontwait.bookstore.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.*;

/**
 *
 * @author sangn
 */
@Path("v2/books")
public class BookResource {

    //API kiểu GET qua các URL gõ trực tiếp trên trình duyệt, 
    //hay URL đưa trong code
    //trả về: tất cả các cuốn sách
    //trả về 1 cuốn sách bất kì nếu đưa về mã-số-cuốn-sách
    //các cuốn sách có thể lấy từ DB lên- lát hồi làm ở V3
    private List<Book> list = new ArrayList();

    public BookResource() {
        list.add(new Book("1 ", "Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", 35, 2022));
        list.add(new Book("2", "Trên đường băng", "Tony buổi sáng", 35, 2022));
        list.add(new Book("3", "Đời ngắn đừng ngủ dài", "Robin Shama", 1, 2017));

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAll() {
        return list;
    }

    //đưa cái tham số trên URL để map biến isbn trong  hàm
    //hàm có isbn thì hàm sẽ có cách lọc/filer/where cuốn sách cần tìm
    @GET
    //api/v2/books/mã-số-sách-cần-tìm
    //api/v2/books/1                                                                                            //path param 
                                                                                                                        //tham số đưa trực tiếp vào 
                                                                                                                        //đường dẫn API, theo kiểu số nhà
   //api/v2/books?mã-số-sách-cần-tìm=1  //query param bên Java Web 
    @Path("{masach}") //thay đổi dựa trên giá trị đưa vào, k có ngoặc -> hard-code
                                    //URL sẽ nhận masach là các giá trị thay dổi
                                   //đường dẫn URL linh hoạt, tuỳ mã sách gõ vào
    @Produces(MediaType.APPLICATION_JSON)
    public Book getOne(@PathParam("masach") String isbn) {
         //search trong list  cuốn coi có cuốnn nào trùng mã với isbn đưa
         //vào hay ko, bài trong OOP luôn
         for (Book x : list) {  //với mọi x là số tự nhiên thuộc tập hợp các số
             if(x.getIsbn().equalsIgnoreCase(isbn))
                    return x;
        }
         //đi hết cả for ko thấy, ko return sớm được thì chắc
         //chắn khôgn thấy sách rồi
        return null;
    }
}
