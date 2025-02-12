package sk.kas.mirda.Cameras.Config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API Documentation",
                version = "1.0",
                description = "API for Cameras"
        )
)
public class Swagger {
//    @Bean
//    public OpenAPI customOpenAPI() {
//        return new OpenAPI()
//                .info(new Info()
//                        .title("Cameras API")
//                        .version("1.0")
//                        .description("API dokumentácia pre projekt Cameras"));
//    }


}

