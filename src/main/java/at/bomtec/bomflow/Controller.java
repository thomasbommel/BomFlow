package at.bomtec.bomflow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/controller")
public class Controller {

	@GetMapping
	public String test() {
		System.out.println("test");
		return "hallo";
	}

}
