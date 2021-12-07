package perf;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ContactsGenerator {

    public Stream<Contact> generateContacts(int count) {
        List<Contact> contacts = new ArrayList<>();

        for(int i = 0; i <= count; i++) {
            contacts.add(new Contact("Contact-" + i, "email-" + i + "@tld"));
        }

        return contacts.stream();
    }

}
