package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import Model.ApplicationUser;
import Repository.ApplicationUserRepository;

@Service
public class ApplicationUserService {

	@Autowired
	ApplicationUserRepository userRepository;
	
	public Optional<ApplicationUser> findById(Long id) {
		return userRepository.findById(id);
	}
	
	public List<ApplicationUser> findAll() {
		return userRepository.findAll();
	}

	public void insert(ApplicationUser user) {
		userRepository.insert(user);
	}
	

	public void deleteAll() {
		userRepository.deleteAll();
	}
}
