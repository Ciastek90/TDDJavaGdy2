import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

public class MockitoTests {
    @Test
    public void mockTest()
    {
        List list = mock(List.class);

        list.add("one");
        list.clear();

        verify(list).add("one");
        verify(list).clear();
    }

    @Test
    public void whenThenReturn(){
        final String expected = "siała baba mak";
        List list = mock(List.class);

        when(list.get(0)).thenReturn("siała baba mak");

        assertThat(list.get(0)).isEqualTo(expected);
    }

    @Test
    public void getPetNames_mockedPetFafik_Fafik(){
        Pet pet = mock(Pet.class);
        Pet tofik = new Pet();
        tofik.setName("tofik");
        Zoo zoo = new Zoo();
        when(pet.getName()).thenReturn("Fafik");
        zoo.giveHomelessPet(pet);
        zoo.giveHomelessPet(tofik);

        final String actual = zoo.getPetNames();

        assertThat(actual).isEqualTo("Fafik");
    }

    @Test
    public void whenThenReturn_loop(){
        final int expected = 30;
        List mockedList = mock(List.class);
        when(mockedList.get(anyInt())).thenReturn(3);
        when(mockedList.get(0)).thenReturn(1);
        when(mockedList.get(1)).thenReturn(2);

        int counter = 0;
        for (int i = 0; i < 10; i++){
            counter += (int)mockedList.get(i);
        }

        assertThat(counter).isEqualTo(expected);
    }

    @Test
    public void verifyGetNameCallsTest(){
        Pet pet = mock(Pet.class);
        Zoo zoo = new Zoo();
        zoo.giveHomelessPet(pet);
        zoo.giveHomelessPet(pet);

        zoo.getPetNames();

        verify(pet,times(2)).getName();
    }

    @Test
    public void listTestAdd(){
        List real = new ArrayList();
        List fake = mock(List.class);

        real.add(1);
        fake.add(1);
    }
}
