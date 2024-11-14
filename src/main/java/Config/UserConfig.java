package Config;


import Controller.UserController;
import Entity.UserLogins;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"Controller","Entity","Services","Repositories"})
public class UserConfig {

    @Bean
    public UserController userController() {
        return new UserController();
    }






}
