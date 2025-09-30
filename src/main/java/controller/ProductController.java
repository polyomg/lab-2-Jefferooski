package controller;

import java.util.*;
import entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;

@Controller
public class ProductController {
    @GetMapping("/product/form")
    public String form(Model model) {
        model.addAttribute("product", new Product());
        return "product/form";
    }

    @PostMapping("/product/save")
    public String save(@ModelAttribute("product") Product p, Model model) {
        model.addAttribute("product", p);
        return "product/form";
    }

    @ModelAttribute("items")
    public List<Product> getItems() {
        return Arrays.asList(
            new Product("A", 1.1),
            new Product("B", 1.2)
        );
    }
}
