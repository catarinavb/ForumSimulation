package com.forum.Forumbackend.service;

import com.forum.Forumbackend.model.Thread;
import com.forum.Forumbackend.model.post.DoubtPost;
import com.forum.Forumbackend.model.post.Post;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThreadService implements ServiceInterface<Thread>{

    private static List<Thread> threads = new ArrayList<>();
    private static List<Post> posts = new ArrayList<>();

    static{
        Thread one = new Thread("Java");
        Thread two = new Thread("C#");
        Thread three = new Thread("Javascript");
        Thread four = new Thread("React");
        Thread five = new Thread("APIs");
        threads.add(one);
        threads.add(two);
        threads.add(three);
        threads.add(four);
        threads.add(five);
        Post first = new DoubtPost("basics of java", "learn the basics of java", "image.jpg");
        one.addPost(first);

    }

    @Override
    public Thread findById(int id) {
        return threads.get(id);
    }


    public Thread add(Thread thread) {
        threads.add(thread);
        return thread;
    }

    @Override
    public Thread update(int id, Thread thread) {
        Thread existentThread = threads.get(id);
        if (existentThread != null) {
            BeanUtils.copyProperties(thread, existentThread);
            threads.add(id, existentThread);
            return existentThread;
        }
        return thread;
    }

    @Override
    public String delete(int id) {
        Thread existentThread = threads.get(id);
        if (existentThread != null) {
            threads.remove(id);
            return "Thread deleted successfully";
        }
        return "Thread not found";
    }

    @Override
    public List getAll() {
        return threads;
    }

    public Thread findByTitle(String title) {
        for(Thread thread : threads) {
            if (thread.getTitle().equals(title)) return thread;
            }

        return null;
    }


}
