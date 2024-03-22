package main;

import java.util.ArrayList;
import java.util.Scanner;

public class articleControllor {
    articlerepa articlerepa = new articlerepa();
    articleview articleview = new articleview();
    butil butil = new butil();

    Scanner scan = new Scanner(System.in);
    int wrong_value = -1;

    public int errorm(String error, int defalutvalue) {
        try {
            return Integer.parseInt(error);
        }
        catch (NumberFormatException e) {
            System.out.println("다시 입력하세요");
            return defalutvalue;
        }
    }

    public void delete() {
        System.out.print("삭제할 게시물을 고르세요: ");
        int inputid = errorm(scan.nextLine(), wrong_value);
        if (inputid == wrong_value) {
            return;
        }
        article article = articlerepa.findid(inputid);
        if (article == null) {
            return;
        }

        articlerepa.darticle(article);
    }
    public void detail() {
        System.out.print("상세보기 할 게시물을 선택하세요: ");
        int inputid = errorm(scan.nextLine(), wrong_value);
        if (inputid == wrong_value) {
            return;
        }
        article article = articlerepa.findid(inputid);
        if (article == null) {
            return;
        }
        article.hapviewpoint();
        articleview.detaillist(article);
        articlerepa.findall();
    }
    public void update() {
        System.out.print("수정할 게시물을 선택해주세요: ");
        int inputid = errorm(scan.nextLine(), wrong_value);
        if (inputid == wrong_value) {
            return;
        }
        article article = articlerepa.findid(inputid);
        if (article == null) {
            return;
        }

        articlerepa.uarticle(article, article.getTitle(), article.getBody());

        System.out.print("수정할 제목을 적어주세요: ");
        String title = scan.nextLine();

        System.out.print("수정할 내용을 적어주세요: ");
        String body = scan.nextLine();

    }

    public void add() {
        System.out.print("제목을 입력하세요: ");
        String title = scan.nextLine();

        System.out.print("내용을 입력하세요: ");
        String body = scan.nextLine();

        articlerepa.savearticle(title, body);
        System.out.println("작성완료");
    }
    public void list() {
        articleview.articlelist(articlerepa.findall());
    }
    public void search() {
        System.out.print("검색하실 키워드를 작성하세요: ");
        /*articlerepa.findkeyword();*/


    }
}
