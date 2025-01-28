package com.example.demo2.service;

import org.springframework.stereotype.Service;

import com.example.demo2.domain.Questionnaire;

@Service
public class QuestionService {

    public Questionnaire save(Questionnaire questionnaire) {
    //引数で受け取ったquestionnaire情報を
    //user2テーブルにインサート
    //hobbysテーブルにインサート
    //メール送信
    System.out.println("Questionnaireのsaveが呼ばれました");
    return questionnaire;
    }
}
