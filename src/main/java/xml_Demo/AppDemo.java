package xml_Demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class AppDemo {
    public static void main(String[] args) throws IOException {
        Author author1 = new Author("Henry", "Keven");
        Author author2 = new Author("Adam", "Levin");
        Book book1 = new Book(2354, "Ymakasy", 23, List.of(author1, author2));

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(book1);

        System.out.println(s);

        File file = new File("Book.json");
        mapper.writeValue(file, book1);

        Book book2 = mapper.readValue(file, Book.class);
        System.out.println(book2);
    }
}
