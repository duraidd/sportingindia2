package durai.essakimuthu.myapplication;

public class modal {

    int img;
    String title,content;

    public modal(int img, String title, String content) {
        this.img = img;
        this.title = title;
        this.content = content;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
