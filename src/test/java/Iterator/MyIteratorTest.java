package Iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class MyIteratorTest {
    @Test
    public void testMyIterator() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Employee e1 = new Employee("Vasya", 18, true);
        Employee e2 = new Employee("Petya", 15, false);
        Employee e3 = new Employee("Ivan", 25, false);
        Employee e4 = new Employee("Jenya", 30, true);
        Employee employees[] = {e1, e2, e3, e4};
        MyIterator myIterator = new MyIterator();
        Employee[] factArray = myIterator.iterate(employees);
        Employee[] expectedArray = {e1, e4};
        Assertions.assertEquals(expectedArray.length, factArray.length);

    }

}