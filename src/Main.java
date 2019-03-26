import adapter.Adapter;
import client.Client;
import impl.ArticleImpl;
import inter.Article;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Article article =  main.getFromNetwork();

        Adapter adapter = new Adapter(article);

        Client client = new Client(adapter);

        client.whoIsAuthor();
        client.whatIsTitle();
        client.WhenIsDistributed();


    }


    public Article getFromNetwork(){
        Article article = new ArticleImpl();
        ((ArticleImpl) article).setAuthorName("Wongkyunban");
        ((ArticleImpl) article).setArticleTitle("Tomorrow is a day");
        ((ArticleImpl) article).setDistributeDate("2019-03-26");
        return article;
    }
}
