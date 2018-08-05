package com.personal.freedom;

import com.personal.freedom.user.entity.MainUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class FreedomApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreedomApplication.class, args);
	}

	@RequestMapping(value = "/login")
	public String userRegister(Model model){
		MainUser mainUser = new MainUser();
		model.addAttribute("mainUser",mainUser);
		return "/login";
	}

}
