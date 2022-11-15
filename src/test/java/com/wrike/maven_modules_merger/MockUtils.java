package com.wrike.maven_modules_merger;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

/**
 * Author: Daniil Shylko
 * Date: 30.08.2022
 */
public class MockUtils {

    public static ExceptionHandler getMockedExceptionHandler() {
        ExceptionHandler exceptionHandler = mock(ExceptionHandler.class);
        doNothing().when(exceptionHandler).onException(any(), any());
        return exceptionHandler;
    }

    private MockUtils() {
    }
}
