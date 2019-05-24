package com.mimaraslan;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mimaraslan.controller.UserController;
import com.mimaraslan.model.User;
import com.mimaraslan.repository.UserRepository;

public class MockitoControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserRepository userRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetUserById() {
        User u = new User();
        u.setId(1l);
        when(userRepository.findOne(1l)).thenReturn(u);

        User user = userController.get(1L);

        verify(userRepository).findOne(1L);

        assertEquals(1L, user.getId().longValue());
    }
}
