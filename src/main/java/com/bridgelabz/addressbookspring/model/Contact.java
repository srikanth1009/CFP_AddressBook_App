package com.bridgelabz.addressbookspring.model;

import com.bridgelabz.addressbookspring.dto.ContactDTO;
import lombok.Data;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "addressbook")
@Data
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Contact_Id")
    private int contactId;
    @Column(name = "First_Name")
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;

    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;


    public Contact() {
    }


    public void updateContact(ContactDTO contactDTO) {
//        this.contactId = contactId;
        this.firstName = contactDTO.firstName;
        this.lastName = contactDTO.lastName;
        this.address = contactDTO.address;
        this.city = contactDTO.city;
        this.state = contactDTO.state;
        this.zip = contactDTO.zip;
        this.phone = contactDTO.phone;
        this.updateDate = new Date(System.currentTimeMillis());
    }


    public void createContact(ContactDTO contactDTO) {
//        this.contactId = contactId;
        this.registerDate = new Date(System.currentTimeMillis());
        this.firstName = contactDTO.firstName;
        this.lastName = contactDTO.lastName;
        this.address = contactDTO.address;
        this.city = contactDTO.city;
        this.state = contactDTO.state;
        this.zip = contactDTO.zip;
        this.phone = contactDTO.phone;

    }
}