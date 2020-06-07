package co.edu.unal.software_engineering.labs.service;

import co.edu.unal.software_engineering.labs.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith( MockitoJUnitRunner.class)
public class AssociationServiceTest {
    @InjectMocks
    private AssociationService associationService;

    public AssociationServiceTest(){}

    @Test
    public void associatedTest(){
        List<Role> listaRoles = new LinkedList();
        User user = new User();
        user.setNames("rene");
        user.setPassword("renepassword");
        user.setSurnames("renesurname");
        user.setUsername("reneusername");
        user.setRoles(listaRoles);
        Role role = new Role();
        role.setRoleName("Estudiante");
        listaRoles.add(role);
        Course course = new Course();
        course.setCourseName("Course Test # 1");
        course.setDurationHours(400);
        Period period = new Period();
        period.setPeriodName("Primero");

        Association association = new Association(user,role,course,period);
        associationService.associate(user,role,course,period);
        associationService.save(association);

        assertNotNull(association);
        assertNotNull(listaRoles);
        assertNotNull(association.getUser().getUsername());
        assertNotNull(association.getRole().getRoleName());
        assertNotNull(association.getCourse().getCourseName());
        assertNotNull(association.getPeriod().getPeriodName());

        assertEquals(association.getUser().getUsername(),user.getUsername());
        assertEquals(association.getRole().getRoleName(),role.getRoleName());
        assertEquals(association.getCourse().getCourseName(),course.getCourseName());
        assertEquals(association.getCourse().getDurationHours(),course.getDurationHours( ));
    }
}
