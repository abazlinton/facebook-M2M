package com.example.m2m;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements ApplicationRunner{

    @Autowired
    PostRepository postRepository;

    @Autowired
    UserRepository userRepository;


    public void run(ApplicationArguments huh){
        User user = new User();
        Post post = new Post();
        userRepository.save(user);
        postRepository.save(post);
        user.setLikedPosts(Arrays.asList(post));
        userRepository.save(user);
        userRepository.delete(user);
        // only post remains :)
    }



}
