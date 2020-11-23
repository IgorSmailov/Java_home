package Homework_Lesson_01_task2;

public class Author {
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    private String authorName;

    void show (){
        System.out.println("Author Name: = " +authorName);
    }

}
