package twootr;

import twootr.database.DatabaseTwootRepository;
import org.junit.Before;

import java.io.IOException;

public class DatabaseTwootRepositoryTest extends AbstractTwootRepositoryTest
{
    @Before
    public void setUp() throws IOException
    {
        repository = new DatabaseTwootRepository();

    }
}
