//package africa.semicolon.trueCaller.services;
//
//import africa.semicolon.trueCaller.data.models.Contact;
//import africa.semicolon.trueCaller.data.repositories.ContactRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ContactServiceImplTest {
//    private ContactService contactService;
//    private ContactRepository contactRepository;
//
//    @BeforeEach public void setUp(){
//        contactRepository = new ContactRepositoryImpl();
//        contactService = new ContactServiceImpl(contactRepository);
//    }
//
//    @Test
//    public void saveContact_findContactReturnsContact(){
//        contactService.addContact("Ijebu", "Ode", "988838");
//
//        Contact contact = contactService.findById(1);
//        assertEquals("Ijebu", contact.getFirstName());
//        assertEquals("Ode", contact.getLastName());
//        assertEquals("988838", contact.getPhoneNumber());
//
//    }
//    @Test public void saveContact2_findContactReturnTest(){
//        contactService.addContact("Samson", "9888");
//        Contact contact = contactService.findById(1);
////        Contact contact1 = contactService.findById(2);
//        assertEquals("Samson",contact.getFirstName());
//        assertEquals("9888", contact.getPhoneNumber());
//    }
//
//}