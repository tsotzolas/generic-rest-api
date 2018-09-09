//package com.ferdisonmezay.tutorials.genericrestapi.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="blog")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//public class Blog extends BaseModel{
//
//    private static final long serialVersionUID = 4192997147639456673L;
//
////    @Id
////    @GeneratedValue(strategy = GenerationType.AUTO)
////    private int id;
//
//    @Column(name = "title")
//    private String title;
//
//    @Column(name = "content")
//    private String content;
//
////    public Blog() {  }
//
////    public Blog(String title, String content) {
////        this.setTitle(title);
////        this.setContent(content);
////    }
////
////    public Blog(int id, String title, String content) {
////        this.setId(id);
////        this.setTitle(title);
////        this.setContent(content);
////    }
//
////    public long getId() {
////        return id;
////    }
//
////    public void setId(int id) {
////        this.id = id;
////    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
////    @Override
////    public String toString() {
////        return "Blog{" +
//////                "id=" + id +
////                ", title='" + title + '\'' +
////                ", content='" + content + '\'' +
////                '}';
////    }
//}
