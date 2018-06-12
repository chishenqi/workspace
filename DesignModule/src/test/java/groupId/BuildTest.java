package groupId;

import static org.junit.Assert.assertTrue;

import Build.Person;
import Build.Student;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BuildTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void buildStudent()
    {
        Student s=new Student.Builder().name("CC").password("qwerty").sex("男").address("银河系第二旋臂").build();

        assertTrue( true );
    }
    @Test
    public void buildPerson()
    {
        Person person = Person.getPerson();
        person.setName("CC");
        person.setPasswd("qwerty");
        person.setSex("男");
        assertTrue( true );
    }
}
