package main;
import java.util.ArrayList;
public class articleview {
    public void articlelist(ArrayList<article> boardlist) {
        System.out.println("===============");
        for (int i = 0; i < boardlist.size(); i++) {
            article article = boardlist.get(i);
            System.out.println("번호: " + article.getId());
            System.out.printf("제목: %s\n", article.getTitle());
            System.out.println("===============");
        }

    }
    public void detaillist(article article) {
        System.out.println("===============");
        System.out.println("번호: " + article.getId());
        System.out.println("제목: " + article.getTitle());
        System.out.println("내용: " + article.getBody());
        System.out.println("조회수: " + article.getViewpoint());
        System.out.println("작성일: " + article.getDate());
        System.out.println("===============");
    }
}
