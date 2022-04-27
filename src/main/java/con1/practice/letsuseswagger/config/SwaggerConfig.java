package con1.practice.letsuseswagger.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "Lets-Study-Swagger with Springdoc",
                description = "Swagger + Springdoc을 사용한 API 문서 관리.",
                version = "v1"))
@Configuration
public class SwaggerConfig {

}
