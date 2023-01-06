package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class GatewayServiceController {

	@RequestMapping("/user-service-circuit-breaker")
	public Mono<String> userServiceCircuitBreaker() {
		return Mono.just("Кориснички сервис биће ускоро доступан.");
	}

}
