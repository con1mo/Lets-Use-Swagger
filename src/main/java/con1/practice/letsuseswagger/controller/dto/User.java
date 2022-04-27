package con1.practice.letsuseswagger.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class User {
    private String name;
    private int age;
    private String job;
    private String address;

    @Builder
    public User(String name, int age, String job, String address){
        this.name = name;
        this.age = age;
        this.job = job;
        this.address = address;
    }
}
