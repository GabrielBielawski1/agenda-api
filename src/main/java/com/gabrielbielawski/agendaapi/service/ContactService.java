package com.gabrielbielawski.agendaapi.service;

import com.gabrielbielawski.agendaapi.dto.ContactDTO;
import com.gabrielbielawski.agendaapi.entity.Contact;
import com.gabrielbielawski.agendaapi.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public ContactDTO save(ContactDTO dto) {
        Contact entity = toEntity(dto);

        Contact saved = contactRepository.save(entity);

        return toDTO(saved);
    }

    public ContactDTO update(Long id, ContactDTO dto) {
        Optional<Contact> existing = contactRepository.findById(id);
        if (existing.isPresent()) {
            Contact contact = existing.get();
            contact.setName(dto.getName());
            contact.setEmail(dto.getEmail());
            contact.setPhone(dto.getPhone());
            Contact updated = contactRepository.save(contact);
            return toDTO(updated);
        }
        return null;
    }

    public boolean delete(Long id) {
        if (contactRepository.existsById(id)) {
            contactRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<ContactDTO> findAll() {
        List<Contact> contacts = contactRepository.findAll();
        return contacts.stream().map(this::toDTO).collect(Collectors.toList());
    }



    private Contact toEntity(ContactDTO dto) {
        Contact contact = new Contact();
        contact.setId(dto.getId());
        contact.setName(dto.getName());
        contact.setEmail(dto.getEmail());
        contact.setPhone(dto.getPhone());
        return contact;
    }
    private ContactDTO toDTO(Contact entity) {
        return new ContactDTO(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getPhone()
        );
    }

    public ContactDTO findById(Long id) {
        Optional<Contact> contact = contactRepository.findById(id);
        return contact.map(this::toDTO).orElse(null);
    }

}

