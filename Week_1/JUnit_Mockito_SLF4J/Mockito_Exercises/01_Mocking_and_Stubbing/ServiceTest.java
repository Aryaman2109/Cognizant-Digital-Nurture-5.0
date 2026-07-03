import static org.mockito.Mockito.*;

import org.mockito.Mockito;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    @Test
    public void testVerifyInteraction(){
        ExternalAPI mockAPI = Mockito.mock(ExternalAPI.class);

        when(mockAPI.getData()).thenReturn("Hello Sakthi");

        Service service = new Service(mockAPI);

        assertEquals("Hello Sakthi", service.fetchData());
    }
}