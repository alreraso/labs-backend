package co.edu.unal.software_engineering.labs.service;

import co.edu.unal.software_engineering.labs.pojo.RegisterUserPOJO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith( MockitoJUnitRunner.class)
public class UserServiceTest {
    @InjectMocks
    UserService userService;

    public UserServiceTest(){}

    @Test
    public boolean isRightUserTest(){
        RegisterUserPOJO registerUserPOJO = new RegisterUserPOJO();
        registerUserPOJO.setNames("rene");
        registerUserPOJO.setPassword("renepassword");
        registerUserPOJO.setSurnames("renesurname");
        registerUserPOJO.setUsername("reneusername");


        if(userService.isRightUser(registerUserPOJO)){
            assertEquals( registerUserPOJO.getNames(),userService.findByUsername(registerUserPOJO.getNames()));
            return true;
        }else{
            return false;
        }
    }
}
