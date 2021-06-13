package com.example.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.user.User;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
public class MainController {

	@Autowired
	private UserRepository repo;

	public ResponseEntity<User>addUser(@RequestBody User user, Map<String, Object> model){

		repo.save(user);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	@GetMapping("/register")
	public String showForm(Model model ) {
		User user = new User();
		model.addAttribute("user", user);
		
		
		List<String> professionList = Arrays.asList("Dazytojas", "Plyteliu klojejas", "Elektrikas", "Santechnikas");
		model.addAttribute("professionList", professionList);
		return "register_form";
	}

	@PostMapping("/register")
	public String submitForm(@Valid @ModelAttribute("user")User user,
							 BindingResult bindingResult, Model model) {
		System.out.println(user);

		if(bindingResult.hasErrors()){
			List<String> professionList = Arrays.asList("Dazytojas", "Plyteliu klojejas", "Elektrikas", "Santechnikas");
			model.addAttribute("professionList", professionList);
			
			return "register_form";
		} else {

			repo.save(user);

			return "register_success";

		}
	}
	
}
