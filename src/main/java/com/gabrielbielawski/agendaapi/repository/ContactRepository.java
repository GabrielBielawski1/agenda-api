package com.gabrielbielawski.agendaapi.repository;

import com.gabrielbielawski.agendaapi.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
