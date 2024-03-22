package main;

public class article {
    private int id;
    private int viewpoint;
    private String title;
    private String body;
    private String date;

    public article(int id, String title, String body, int viewpoint, String date) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.viewpoint = viewpoint;
        this.date = date;
    }

    public void hapviewpoint() {this.viewpoint++;}
    public int getViewpoint() {return viewpoint;}
    public void setViewpoint(int viewpoint) {this.viewpoint = viewpoint;}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getBody() {return body;}
    public void setBody(String body) {this.body = body;}

    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}
}
