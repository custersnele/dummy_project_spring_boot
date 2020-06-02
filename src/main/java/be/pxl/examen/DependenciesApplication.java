package be.pxl.examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class DependenciesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependenciesApplication.class, args);
	}

}
