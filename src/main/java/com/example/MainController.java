package com.example;

import java.util.Arrays;
import java.util.List;

import com.example.model.user.UserRepository;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.user.User;


@Controller
public class MainController {

	@Autowired
	UserRepository repo;

	@GetMapping("/register")
	public String showForm(Model model ) {
		User user = new User();
		model.addAttribute("user", user);
		
		
		List<String> professionList = Arrays.asList("Dazytojas", "Plyteliu klojejas", "Elektrikas", "Santechnikas");
		model.addAttribute("professionList", professionList);
		return "register_form";
	}

	@PostMapping("/register")
	public String submitForm(@ModelAttribute("user")User user) {
		System.out.println(user);
		repo.save(user);
		
		return "register_success";
		
		
	}
	
}
