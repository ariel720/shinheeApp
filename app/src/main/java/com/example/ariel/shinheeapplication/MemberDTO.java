package com.example.ariel.shinheeapplication;

/**
 * Created by ariel on 2017-06-16.
 */

public class MemberDTO {

    public  String name;
    public  String email;
    public  String msg;
    public  int img;

    public MemberDTO(String name, String email, String msg, int img) {
        this.name = name;
        this.email = email;
        this.msg = msg;
        this.img = img;
    }
}
