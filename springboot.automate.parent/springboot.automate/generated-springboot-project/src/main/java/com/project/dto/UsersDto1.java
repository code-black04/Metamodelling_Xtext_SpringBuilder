package com.project.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersDto1 {

    private UUID id;

    private String emailId;

    private String username;

    private String password;

    private Date dob;

    private Timestamp createdAt;

}