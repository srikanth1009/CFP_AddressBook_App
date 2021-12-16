package com.bridgelabz.addressbookspring.service;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookspring.dto.ContactDTO;
import com.bridgelabz.addressbookspring.model.Contact;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {
    @Override
    public List<Contact> getContact() {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact(1,
                new ContactDTO("Srikanth", "Reddy", "Gudur", "Karnataka", "Bengaluru", "560064", "9876543210")));
        return contactList;
    }

    @Override
    public Contact getContactById(int contactId) {
        Contact contact = new Contact(1,
                new ContactDTO("Hemanth", "Reddy", "Nellore", "Karnataka", "Chikkabalapura", "561210", "999999999"));
        return contact;
    }

    @Override
    public Contact createContact(ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        return contact;
    }

    @Override
    public Contact updateContact(int contactId, ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        return contact;
    }

    @Override
    public void deleteContact(int contactId) {

    }
}