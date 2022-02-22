package xml_Demo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;
@JsonPropertyOrder({"name","article", "authors", "number"})
public class Book {
    private int article;
    private String name;
    private int number;
    private List<Author> authors = new ArrayList<Author>();

    public Book(){}

    public Book(int article, String name, int number, List<Author> authors) {
        this.article = article;
        this.name = name;
        this.number = number;
        this.authors = authors;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "article=" + article +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", authors=" + authors +
                '}';
    }
}
