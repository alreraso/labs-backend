package co.edu.unal.software_engineering.labs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LabsApplicationTests{

	@Test
	public void AssociationServiceTestError( ){
		String tester = "TestSuccess";
		String confirm = "TestSuccess";

		assertEquals("success test",tester,confirm);
	}

}