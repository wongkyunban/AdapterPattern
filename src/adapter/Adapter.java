package adapter;

import inter.Article;
import inter.Target;

public class Adapter implements Target {

    private Article article;
    public Adapter(Article article){
        this.article = article;
    }

    @Override
    public String getDate() {
        return article.getDistributeDate();
    }

    @Override
    public String getTitle() {
        return article.getArticleTitle();
    }

    @Override
    public String getAuthor() {
        return article.getAuthorName();
    }
}
