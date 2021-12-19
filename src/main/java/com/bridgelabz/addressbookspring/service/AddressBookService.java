package com.bridgelabz.addressbookspring.service;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookspring.dto.ContactDTO;
import com.bridgelabz.addressbookspring.exception.AddressBookException;
import com.bridgelabz.addressbookspring.model.Contact;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    List<Contact> contactList = new ArrayList<>();

    @Override
    public List<Contact> getContact() {

        return contactList;
    }

    @Override
    public Contact getContactById(int contactId) {
        return contactList.stream().filter(contact -> contact.getContactId() == contactId).findFirst()
                .orElseThrow(() -> new AddressBookException("Contact not found"));
    }

    @Override
    public Contact createContact(ContactDTO contactDTO) {
        Contact contact = new Contact(contactList.size() + 1, contactDTO);
        contactList.add(contact);
        return contact;
    }

    @Override
    public Contact updateContact(int contactId, ContactDTO contactDTO) {
        Contact contact = this.getContactById(contactId);
        contact.setFirstName(contactDTO.firstName);
        contact.setLastName(contactDTO.lastName);
        contact.setAddress(contactDTO.address);
        contact.setState(contactDTO.state);
        contact.setCity(contactDTO.city);
        contact.setZip(contactDTO.zip);
        contact.setPhone(contactDTO.phone);
        contactList.set(contactId - 1, contact);
        return contact;
    }

    @Override
    public void deleteContact(int contactId) {

        contactList.remove(contactId-1);
    }
}