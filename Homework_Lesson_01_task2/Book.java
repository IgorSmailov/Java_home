package Homework_Lesson_01_task2;

public class Book {
    public static void main(String[] args) {
Book book = new Book();
Author author = new Author();
author.setAuthorName("Aaron Frisch");
author.show();

Title title = new Title();
title.setTitle("Built for Success: The Story of Nike");
title.show();

Content content = new Content();
content.setContent("Nike, the world’s most popular and biggest sportswear company. " +
        "\nIn just over 50 years, one man’s dream of better shoes turned into a global corporation worth over $100 billion. " +
        "\nToday, we’re going back to the earliest days of Nike to figure out how that magic happened and what the ingredients were to their success. Read more: www.amazon.com");
content.show();


    }
}
