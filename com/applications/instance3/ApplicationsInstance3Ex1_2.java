//package com.applications.instance3;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Date;
//import java.util.List;
//import java.util.Objects;
//
//
//class Book implements Comparable<Book> {
//    private String title;
//    private Date publishDate;
//    private String comment;
//    
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
//
//    @Override
//    public int compareTo(Book o) {
//        // TODO Auto-generated method stub
//        // sort 타고 들어가서 가져온 로직
//        return this.publishDate.compareTo(o.publishDate);
//    }
//    
//    
//    
//}
//
//public class ApplicationsInstance3Ex1_2 {
//    public static void main(String[] args) {
//        List<Book> bookList = new ArrayList<>();
//        
//        Book book1 = new Book("해리포터", new Date(), "dsadsad");
//        Book book2 = new Book("반지의 제왕", new Date(12312), "asdasds");
//        Book book3 = new Book("dddddd", new Date(12312122), "asdasds");
//
//        
//        bookList.add(book1);
//        bookList.add(book2);
//        bookList.add(book3);
//
//        for (Book book : bookList) {
//            System.out.println(book.getTitle());
//            System.out.println(book.getPublishDate());
//        }
//        System.out.println();
//
////       Collections.sort(bookList);
////       Collections.reverse(bookList);
//        
//        
//       
//        for (Book book : bookList) {
//            System.out.println(book.getTitle());
//            System.out.println(book.getPublishDate());
//        }
//        System.out.println();
//        
//    }
//}
