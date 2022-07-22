package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ContactRepository extends MongoRepository<Contact, String> {
    List<Contact> findContactByFirstName(String firstName);
    List<Contact> findContactByLastName(String lastName);
    Contact findContactByPhoneNumber(String phoneNumber);

    @Override
    Optional<Contact> findById(String id);
}

