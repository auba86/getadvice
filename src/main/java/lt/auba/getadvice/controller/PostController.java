package lt.auba.getadvice.controller;

import lt.auba.getadvice.model.Post;
import lt.auba.getadvice.model.User;
import lt.auba.getadvice.service.PostService;
import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import java.util.Date;

@Controller
@RequestMapping("/")
public class PostController {

    @Autowired
    private PostService postService;

//    @GetMapping("/newPostForm")
//    public String newPostForm(Model model) {
//        Post post = new Post();
//        model.addAttribute("post", post);
//        return "create_post";
//    }

    @GetMapping("/newPostForm/{id}")
    public String newPostForm2(Model model) {
        Post post = new Post();
        model.addAttribute("post", post);
        return "create_post";
    }

    @GetMapping("/getAllPosts")
    public String getAllPost(Model model) {
        Post post = new Post();
        model.addAttribute("post", post);
        return "posts";
    }

    @PostMapping("/saveNewPost")
    public String saveNewPost(@ModelAttribute("post") Post post){
//        Date date = new Date();
//        Date currDate = new Date(date.getTime());
//        post.setPostDate(currDate);
        postService.saveNewPost(post);
        return "redirect:/";
    }


}
