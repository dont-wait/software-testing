/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dontwait.bookstore.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 *
 * @author sangn
 */
//Serializable là 1 interface đặc biệt, ko có hàm nào ta cần viết code cho nó
//viết code cho nó. Nó k chứa hàm abstract
//Nó dùng làm gì: DÙNG ĐỂ ĐÁNH DẤU CLASS CÓ ĐIỀU ĐẶC BIỆT NÀO ĐÓ
//                DÙNG ĐỂ RA HIỆU, BÁO HIỆU CHO JVM BIẾT
//                LÀ JVM MÀY CÓ LÚC NÀO ĐÓ SẼ PHẢI CHẺ CÁI OBJECT
//                BOOK NÀY THÀNH CÁCH LUỒNG/DÃY/DÒNG CHẢY BIT/BYTE
//                ĐỂ ĐEM CUỐN SÁCH XUỐNG DB
//                CHỈ CONVERT INFO/FIELD THÀNH LUỒNG BYTE, KO CONVERT 
//                HÀM ĐEM XUỐNG, SERIAL... TỪNG DÃY TỪNG DÃY
//INTERFACE NÀY ĐC GỌI 1 TÊN: MARKER INTERFACE   

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book implements Serializable{
    private String isbn;    //mã cuốn sách
    private String title;   //tựa đề cuốn sách
    private String author;  //tác giả cuốn sách
    private int edition;    //xuất bản lần mấy
    private int publishedYear;  //năm xuất bản
 
}
