package con1.practice.letsuseswagger.controller;

import con1.practice.letsuseswagger.controller.dto.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Operation(summary = "Say hello to swagger study API.",
            tags = {"test"},
            description = "Server returns 'hello world!'"
    )
    @GetMapping("/hello")
    public String helloApi() {
        return "hello world!";
    }

    @Operation(summary = "Get Geonil's profile",
            tags = {"test"},
            description = "Server returns Geonil's simple profile information.",
            responses = {
                @ApiResponse(description = "Geonil's profile", content = @Content(
                        mediaType = "application/json",
                        schema = @Schema(implementation = User.class)
                ))
            }
    )
    @GetMapping("/callGeonil")
    public ResponseEntity<User> callGeonil() {
        User user = new User("건일", 29, "개발자", "경기도 고양시 일산동구 풍동");
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
