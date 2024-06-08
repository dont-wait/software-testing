/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dontwait.bookstore.resource.v1;

import com.dontwait.bookstore.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author sangn
 */
@Path("v1/books")
//ai đó mà gõ: localHost:6969/bookstore -> vào web app môn Java web
//ai đó mà gõ: localHost:6969/bookstore/api/v1/books chắc chắn
//đến đc class này rồi!!!
//đến class  lại bị bối rối:
//CLASS LẠI CÓ NHIỀU HÀM!!! LẤY HÀM NÀO MÀ XÀI, MÀ ỨNG VỚI URL?
//CÓ KHI LẠI THÊM 1 TẦNG ÁNH XẠ NỮA CHO MỖI HÀM 1 CÁI TÊN, 1 NICK NAME RIÊNG
//THÊM 1 TẦNG /
public class BookResource {
    
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String sayHello() {
//        return "One small message return from my own first API" 
//        + ", One change leap for IT knowledge/career!!!";
//    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBook() {
        return new Book("9780593138519", " Stolen Focus: Why You Can't Pay Attention ", "Johann Hari", 1, 2022);
            
    }
}
