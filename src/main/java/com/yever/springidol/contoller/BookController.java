package com.yever.springidol.contoller;

import com.yever.springidol.model.Book;
import com.yever.springidol.model.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 2017/5/22.
 */
@Controller
@RequestMapping("/")
public class BookController {
    @Autowired
    private BookRepository bookRepository;
    private List<Book> readingList = new ArrayList<>();
    @RequestMapping(value = "/{author}", method = RequestMethod.GET)
    public String readersBooks(@PathVariable("author") String author, Model model) {

        readingList = bookRepository.findByAuthor(author);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }

    @RequestMapping(value = "/author", method = RequestMethod.POST)
    public String addToReadingList(Book book) {

        bookRepository.save(book);
        return "redirect:/author";

    }
}
