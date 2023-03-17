//package com.applications.instance3;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Objects;
//import java.util.Set;
//
//class Book {
//    private String title;
//    private Date publishDate;
//    private String comment;
//    
//    public Book(String title, Date publishDate, String comment) {
//        this.title = title;
//        this.publishDate = publishDate;
//        this.comment = comment;
//    }
//    
//    public Book(String title, Date publishDate) {
//        this(title, publishDate, "no comment");
//    }
//    
//    public String getTitle() {
//        return title;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }
//    public Date getPublishDate() {
//        return publishDate;
//    }
//    public void setPublishDate(Date publishDate) {
//        this.publishDate = publishDate;
//    }
//    public String getComment() {
//        return comment;
//    }
//    public void setComment(String comment) {
//        this.comment = comment;
//    }
//
//    // 오버라이드한 hashCode를 제목과 출간일이 같으면 같은 책으로 판단할 수 있게 재정의 해주었다.
//    @Override
//    public int hashCode() {
//        return Objects.hash(publishDate, title);
//    }
//
//    // 오버라이드한 equals를 제목과 출간일이 같으면 같은 책으로 판단할 수 있게 재정의 해주었다.
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Book other = (Book) obj;
//        
//        return Objects.equals(publishDate, other.publishDate)
//                && Objects.equals(title, other.title);
//    }
//}
//
//public class ApplicationsInstance3Ex1 {
//    public static void main(String[] args) {
//        Set<Book> bookSet = new HashSet<>();
//        List<Book> bookList = new ArrayList<>();
//        
//        Book book1 = new Book("해리포터", new Date(), "dsadsad");
//        Book book2 = new Book("해리포터", new Date(), "asdasds");
//        
//        // book1 과 book2의 비교
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book1 == book2);
//        System.out.println(book1.equals(book2));
//        System.out.println();
//        
//        // book1.hashCode 값과 book2.hashCode 값의 비교 
//        System.out.println(book1.hashCode());
//        System.out.println(book2.hashCode());
//        System.out.println(book1.hashCode() == book2.hashCode());
//        System.out.println();
//        
//        // Set에서 book1과 book2의 비교 (근데 Set이라 둘이 같은 값이면 중복이라 1개만 들어감)
//        bookSet.add(book1);
//        bookSet.add(book2);
//
//        for (Book book : bookSet) {
//            System.out.println(book);
//        }
//        System.out.println();
//        
//        // List에서 book1과 book2의 비교
//        bookList.add(book1);
//        bookList.add(book2);
//        
//        Iterator<Book> it = bookList.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//        
//        System.out.println(bookList.get(0) == bookList.get(1));
//        System.out.println(bookList.get(0).equals(bookList.get(1)));
//        System.out.println(bookList.get(0).hashCode() == bookList.get(1).hashCode());
//    }
//}
