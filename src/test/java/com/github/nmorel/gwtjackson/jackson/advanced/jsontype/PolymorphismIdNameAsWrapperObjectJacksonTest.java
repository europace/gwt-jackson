package com.github.nmorel.gwtjackson.jackson.advanced.jsontype;

import com.github.nmorel.gwtjackson.jackson.AbstractJacksonTest;
import com.github.nmorel.gwtjackson.shared.advanced.jsontype.PolymorphismIdNameAsWrapperObjectTester;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Nicolas Morel
 */
public class PolymorphismIdNameAsWrapperObjectJacksonTest extends AbstractJacksonTest {

    @Test
    public void testSerialize() {
        PolymorphismIdNameAsWrapperObjectTester.INSTANCE
            .testSerialize( createWriter( PolymorphismIdNameAsWrapperObjectTester.Person[].class ) );
    }

    @Test
    @Ignore("jackson can't event find the subtype, booooo")
    public void testDeserialize() {
        PolymorphismIdNameAsWrapperObjectTester.INSTANCE
            .testDeserialize( createReader( PolymorphismIdNameAsWrapperObjectTester.Person[].class ) );
    }
}