package io.github.ppsoftware.rpgSys.main;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
/**
 * Hello world!
 *
 */

@RestController
@EnableAutoConfiguration
public class App 
{
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
}
