package DataBase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"DataBase.model"})
@EnableJpaRepositories("DataBase.repository")
public class Application extends Throwable {
    public static void main(String[] args) { SpringApplication.run(Application.class, args);
    }
}