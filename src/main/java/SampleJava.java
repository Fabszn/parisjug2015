import model.Contact;

import java.util.Optional;


/**
 * Created by fsznajderman on 11/11/2014.
 */
public class SampleJava {


    public static void main(String[] args) {

        Contact c1 = null;
        Contact c2 = new Contact("Hari","kovair",34);

        Optional<Contact> o1 = Optional.ofNullable(c1);
        Optional<Contact> o2 = Optional.of(c2);

        System.out.println("o1 = " + o1);
        System.out.println("o2 = " + o2);
    }
}
