package com.husseinelfeky.bazelsample.protosample;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.husseinelfeky.bazelsample.protosample.AddressBookProtos.Person;

public class PersonProvider {

    public static void printPerson() throws InvalidProtocolBufferException {
        System.out.println(JsonFormat.printer().print(makePerson(123, "John Doe")));
    }

    public static Person makePerson(Integer id, String name) {
        Person.Builder person = Person.newBuilder();
        person.setId(id);
        person.setName(name);
        return person.build();
    }
}
