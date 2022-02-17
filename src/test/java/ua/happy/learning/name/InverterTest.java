package ua.happy.learning.name;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Given String with name
 * "John Smith" => "Smith, John"
 * "Mr. John Smith" => "Smith, John"
 * "John Smith Sr. PhD." => "Smith, John Sr. PhD."
 * " John      Smith" => "Smith, John"
 */
public class InverterTest {

    @Test
    @Order(1)
    void invert_null_throw_NPE() {
        assertThrows(NullPointerException.class, () -> Inverter.invert(null));
    }

    @Test
    @Order(2)
    void invert_emptyString_return_emptyString() {
        assertThat(Inverter.invert(""), is(""));
        assertThat(Inverter.invert("     "), is(""));
    }

    @Test
    @Order(3)
    void invert_firstName_return_firstName() {
        assertThat(Inverter.invert("John"), is("John"));
        assertThat(Inverter.invert("     John   "), is("John"));
    }

    @Test
    @Order(4)
    void invert_firstLast_return_lastCommaFirst() {
        assertThat(Inverter.invert("John Smith"), is("Smith, John"));
        assertThat(Inverter.invert("John      Smith"), is("Smith, John"));
    }

    @Test
    @Order(5)
    void invert_honorificsFirstLast_return_lastCommaFirst() {
        assertThat(Inverter.invert("Mr. John Smith"), is("Smith, John"));
        assertThat(Inverter.invert("Mrs. Jane Smith"), is("Smith, Jane"));
    }

    @Test
    @Order(6)
    void invert_firstLastPostnominals_return_lastCommaFirstPostnominals() {
        assertThat(Inverter.invert("John Smith Sr."), is("Smith, John Sr."));
        assertThat(Inverter.invert("John Smith Sr. PhD."), is("Smith, John Sr. PhD."));
    }

    @Test
    @Order(6)
    void invert_acceptanceTest() {
        assertThat(Inverter.invert("Mr.         John Smith     Sr.      PhD."), is("Smith, John Sr. PhD."));
    }
}
