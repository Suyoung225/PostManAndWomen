package com.example.postmanandwomen.controller.request;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequestDto {

  @NotBlank
  private String nickname;

  @NotBlank
  private String password;

}
