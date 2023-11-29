package info.dmerej.contacts;

import java.util.UUID;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ContactsGenerator {
    public Stream<Contact> generateContacts(int count) {

        return IntStream.range(1, count + 1).mapToObj(i -> new Contact(UUID.randomUUID().toString(), String.format("email-%d@tld", i)));

    }
}
