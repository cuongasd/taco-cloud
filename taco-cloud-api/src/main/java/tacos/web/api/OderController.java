package tacos.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tacos.domain.Order;
import tacos.domain.Taco;
import tacos.repository.OrderRepository;

@RestController
@RequestMapping(path = "/orders", produces = "application/json")
public class OderController {
	@Autowired
	private OrderRepository orderRepository;
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Order postTaco(@RequestBody Order order) {
		return orderRepository.save(order);
	}
}
