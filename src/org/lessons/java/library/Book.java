package org.lessons.java.library;

public class Book {
//    Class Attributes
    private String title;
    private int pages;
    private String author;
    private String editor;

// Specific exceptions
    //    Empty title
    public class TitleEmptyException extends IllegalArgumentException{
        public TitleEmptyException(){
            super("Title can't be empty!");
        }
    }
    // Positive pages
    public class PagesNonPositiveException extends IllegalArgumentException{
        public PagesNonPositiveException() {
            super("The number of pages must be positive.");
        }
    }
    // Empty Author
    public class AuthorEmptyException extends IllegalArgumentException{
        public AuthorEmptyException(){
            super("Author can't be empty.");
        }
    }

    // Empty Editor
    public class EditorEmptyException extends IllegalArgumentException{
        public EditorEmptyException(){
            super("Editor can't be empty.");
        }
    }

    //    Class Constructor


    public Book(String title, int pages, String author, String editor) throws IllegalArgumentException{
        if (title == null || title.isEmpty() || title.equals(" ")) {
            throw new TitleEmptyException();
        } else if (pages <= 0) {
            throw new PagesNonPositiveException();
        } else if (author == null || author.isEmpty() || author.equals(" ")) {
            throw new AuthorEmptyException();
        } else if (editor == null || editor.isEmpty() || editor.equals(" ")) {
            throw new EditorEmptyException();
        }
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.editor = editor;
    }

//    Class Methods

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws TitleEmptyException{
        if (title == null || title.isEmpty() || title.equals(" "))
        {
            throw new TitleEmptyException();
        }
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) throws PagesNonPositiveException {
        if (pages <= 0) {
            throw new PagesNonPositiveException();
        }
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws AuthorEmptyException {
        if (author == null || author.isEmpty() || author.equals(" "))
        {
            throw new AuthorEmptyException();
        }
            this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) throws EditorEmptyException{
        if (editor == null || editor.isEmpty() || editor.equals(" ")){
            throw new EditorEmptyException();
        }
        this.editor = editor;
    }
}
