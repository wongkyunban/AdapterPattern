package impl;

import inter.Article;

public class ArticleImpl implements Article {
    private String authorName;
    private String articleTitle;
    private String distributeDate;

    @Override
    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String getArticleTitle() {
        return articleTitle;
    }

    @Override
    public String getDistributeDate() {
        return distributeDate;
    }

    public void setDistributeDate(String distributeDate) {
        this.distributeDate = distributeDate;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }
}
