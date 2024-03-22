package main;

import java.util.ArrayList;

public class articlerepa {
    ArrayList<article> articleList = new ArrayList<>();
    butil butil = new butil();
    int laid = 4;


    public articlerepa() {
        testdata();
    }

    public void testdata() {
        article a1 = new article(1, "안녕하세요 반갑습니다. 자바 공부중이에요.", "냉무", 0, butil.gettime());
        article a2 = new article(2, "자바 질문좀 할게요~", "냉무", 0, butil.gettime());
        article a3 = new article(3, "정처기 따야되나요?", "냉무", 0, butil.gettime());

        articleList.add(a1);
        articleList.add(a2);
        articleList.add(a3);

    }

    public ArrayList<article> findkeyword(String keyword) {
        ArrayList<article> searchedList = new ArrayList<>();
        for (int i = 0; i < articleList.size(); i++) {
            article article = articleList.get(i);
            if (article.getTitle().contains(keyword)) {
                searchedList.add(article);
            }
        }
        return searchedList;
    }

    public ArrayList<article> findall() {
        return articleList;
    }

    public article findid(int id) {
        for (int i = 0; i < articleList.size(); i++) {
            article article = articleList.get(i);
            if (article.getId() == id) {
                return article;
            }
        }
        return null;
    }

    public article savearticle(String title, String body) {
        article article = new article(laid, title, body, 0, butil.gettime());
        articleList.add(article);
        laid++;

        return article;
    }

    public void darticle(article article) {articleList.remove(article);}

    public void uarticle(article article, String newtitle, String newbody) {
     article.setTitle(newtitle);
     article.setBody(newbody);
    }
}
