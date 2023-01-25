package com.tosan.core_banking.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public final class UserRegisterInputDto extends BaseDto {
    private String username;
    private String password;
}