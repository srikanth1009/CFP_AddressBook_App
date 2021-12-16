package com.bridgelabz.addressbookspring.service;

import java.util.List;

import com.bridgelabz.addressbookspring.dto.ContactDTO;
import com.bridgelabz.addressbookspring.model.Contact;

public interface IAddressBookService {
    List<Contact> getContact();

    Contact getContactById(int contactId);

    Contact createContact(ContactDTO contactDTO);

    Contact updateContact(int contactId, ContactDTO contactDTO);

    void deleteContact(int contactId);
}
