package jobportal.jobportal.service;

import jobportal.jobportal.entity.UsersType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UsersTypeServiceTest {

    @Autowired
    UsersTypeService usersTypeService;

    @Test
    void testUsersTypeAll() {
        List<UsersType> usersTypeList = usersTypeService.getAll();
        assertEquals(usersTypeList.size(), 2);
        assertEquals(usersTypeList.get(0).getType(), "RECRUITER");
        assertEquals(usersTypeList.get(1).getType(), "CANDIDATE");
    }

}
