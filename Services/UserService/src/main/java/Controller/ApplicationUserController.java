package Controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.ApplicationUser;
import Service.ApplicationUserService;

@RestController
@RequestMapping("/users")
public class ApplicationUserController {
	
	private ApplicationUserService userService;
	
	@GetMapping
	public List<ApplicationUser> getAllUsers() {
		return userService.findAll();
	}

}
