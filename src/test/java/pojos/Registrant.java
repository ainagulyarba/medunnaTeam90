package pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Registrant {

    private String SSN;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;


}