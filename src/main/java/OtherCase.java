import com.google.common.base.Optional;
import model.Contact;


/**
 * Created by fsznajderman on 28/11/2014.
 */
public class OtherCase {


    public void version1() {

        final Contact c1 = findInRepo1(1);

        int age = 0;

        if (c1 != null) {
            age = c1.getAge();
        }


        final Contact c2 = findInRepo2(1);
        if (c2 != null) {
            age = c2.getAge();
        }


        if (age != 0) {
            System.out.println("Age = " + age);
        } else {
            System.out.printf("Contact not found");
        }

    }

    public void version2() {

        findInRepo1WithOption(1).or(findInRepo2WithOption(1)).transform(c -> "Age = " + c.getAge()).or("Contact not found");

    }



    private Contact findInRepo1(Integer id) {
        //code

        return null;
    }

    private Contact findInRepo2(Integer id) {
        //code

        return null;
    }

    private Optional<Contact> findInRepo1WithOption(Integer id) {
        //code

        return Optional.fromNullable(null);
    }

    private Optional<Contact> findInRepo2WithOption(Integer id) {
        //code

        return Optional.fromNullable(null);
    }



}
