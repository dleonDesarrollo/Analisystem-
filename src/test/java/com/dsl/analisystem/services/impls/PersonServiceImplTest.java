package com.dsl.analisystem.services.impls;

import com.dsl.analisystem.TestConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@TestConfig
public class PersonServiceImplTest {

    @Autowired
    PersonServiceImpl personService;

    @Test
    void testFindAllOk(){
        var result = personService.findAll();

        Assertions.assertNotNull(result);
        Assertions.assertFalse(result.isEmpty());
    }
}
