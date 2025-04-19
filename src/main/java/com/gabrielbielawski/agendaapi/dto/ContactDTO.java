package com.gabrielbielawski.agendaapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ContactDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;

    public ContactDTO(Long id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
