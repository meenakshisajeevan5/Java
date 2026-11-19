package Day3;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person();
    }

    @After
    public void tearDown() throws Exception {
        person = null;
    }

    @Test
    public void testGettersAndSetters() {
        person.setWeight(70);
        person.setHeight(1.75f);

        assertEquals(70, person.getWeight());
        assertEquals(1.75f, person.getHeight(), 0.001f);
    }

    @Test
    public void testGetBodyMassIndex_ValidInput() {
        assertEquals("Underweight", person.getBodyMassIndex(50, 1.8));
        assertEquals("Normal weight", person.getBodyMassIndex(70, 1.75));
        assertEquals("Overweight", person.getBodyMassIndex(80, 1.75));
        assertEquals("Obese", person.getBodyMassIndex(100, 1.75));

    }
    @Test
    public void testGetBodyMassIndex_InvalidInput(){
        assertEquals("Invalid input", person.getBodyMassIndex(0,1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(-10,1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(601,1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(70,0));
        assertEquals("Invalid input", person.getBodyMassIndex(70,-1.5));
        assertEquals("Invalid input", person.getBodyMassIndex(70,3.1));


    }


    }