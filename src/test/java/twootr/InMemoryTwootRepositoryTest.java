package twootr;

import twootr.in_memory.InMemoryTwootRepository;
import org.junit.Before;

public class InMemoryTwootRepositoryTest extends AbstractTwootRepositoryTest
{
    @Before
    public void setUp()
    {
        repository = new InMemoryTwootRepository();

    }
}
