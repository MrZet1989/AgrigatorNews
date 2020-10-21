package com.webserver.chooseyournews.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class User {
    public static final String DEF_AV = "default.jpg";

    private String email;
    private String login;
    private String password;
    private String avatar;

}
