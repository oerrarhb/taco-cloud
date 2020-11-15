package com.othmane.oertacocloud.security;

import com.othmane.oertacocloud.data.TUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
@AllArgsConstructor
@Getter
@Setter
public class RegistrationForm {
    private String username;
    private String password;
    private String fullname;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;

    public TUser toUser(PasswordEncoder passwordEncoder) {
        return new TUser()
                .withUsername(username)
                .withPassword(passwordEncoder.encode(password))
                .withFullname(fullname)
                .withStreet(street)
                .withCity(city)
                .withState(state)
                .withZip(zip)
                .withPhone(phone)
                .withEmail(email);
    }
}
