package com.example.m2m;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "likedPosts")
    private List<User> likingUsers = new ArrayList<>();

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<User> getLikingUsers() {
        return likingUsers;
    }

    public void setLikingUsers(List<User> likingUsers) {
        this.likingUsers = likingUsers;
    }
}
