import model.Contact;
import service.ContactService;

import java.util.Optional;

/**
 * Created by fsznajderman on 11/11/2014.
 */
public class Main {


    public static void main(String[] args) {
            final ContactService cs = new ContactService();

            final Contact c = cs.getContactById(1);

            if (c != null) {
                System.out.println("Age = " + c.getAge());
            } else {
                System.out.println("Contact not found");
            }

        }



    }


