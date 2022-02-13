package Project1.Authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import Project1.Authentication.Service.AuthenticationService;
import Project1.Authentication.controllers.AuthenticationController;
import Project1.Authentication.entities.User;
import Project1.Authentication.exceptions.UserNotFoundException;

@SpringBootApplication
@Import({
      AuthenticationController.class,
      UserNotFoundException.class,
      AuthenticationService.class,
      User.class
})
public class AuthenticationApplication {

   public static void main(String[] args) {
      SpringApplication.run(AuthenticationApplication.class, args);
   }

}