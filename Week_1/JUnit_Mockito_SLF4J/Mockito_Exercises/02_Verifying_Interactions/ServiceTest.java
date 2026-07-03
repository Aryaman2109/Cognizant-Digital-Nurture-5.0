import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    public void testVerifyInteraction(){
        ExternalAPI mockAPI = mock(ExternalAPI.class);

        Service service = new Service(mockAPI);
        service.fetchData();

        verify(mockAPI).getData();
    }
}