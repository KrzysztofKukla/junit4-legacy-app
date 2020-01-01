package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

/**
 * @author Krzysztof Kukla
 */
@ExtendWith(MockitoExtension.class)
public class MockitoUnitTest {

    @Mock
    private Map<String, String > mockMap;

    @Test
    void mapTest() throws Exception {
        mockMap.put("a","ddd");
        Assertions.assertEquals("ddd",mockMap.get("a"));
    }
}
