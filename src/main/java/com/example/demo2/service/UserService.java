package com.example.demo2.service;

import org.springframework.stereotype.Service;

import com.example.demo2.domain.User;

@Service
public class UserService {

    public User save(User user) {
    //引数で受け取ったuser情報を
    //userテーブルにインサート
    //hobbysテーブルにインサート
    //メール送信
    System.out.println("UesrServiceのsavaが呼ばれました");
    return user;
    }
}

