import org.junit.jupiter.api.Test;
import ru.netology.manager.FilmsManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmsManagerTest {
    String film1 = new String("Бладшот");
    String film2 = new String("Вперед");
    String film3 = new String("Отель Белград");
    String film4 = new String("Джентельмены");
    String film5 = new String("Человек-Невидимка");
    String film6 = new String("Тролли.Мировой тур");
    String film7 = new String("Номер один");
    String film8 = new String("Телефон мистера Харригана");
    String film9 = new String("Небо");
    String film10 = new String("Дневная смена");
    String film11 = new String("Начало");

    @Test
    public void FilmsAddFindAllTest() {
        FilmsManager manager = new FilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        String[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        String[] actual = manager.findAll();
        assertArrayEquals(actual, expected);

    }

    @Test
    public void FilmsFindLastTest1() {
        FilmsManager manager = new FilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();
        assertArrayEquals(actual, expected);
    }

    @Test
    public void FilmsFindLastTest2() {
        FilmsManager manager = new FilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        String[] expected = {film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();
        assertArrayEquals(actual, expected);
    }

    @Test
    public void FilmsFindLastTest3() {
        FilmsManager manager = new FilmsManager();
        manager.add(film1);
        String[] expected = {film1};
        String[] actual = manager.findLast();
        assertArrayEquals(actual, expected);
    }

    @Test
    public void FilmsFindLastTest4() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.findLast();
        assertArrayEquals(actual, expected);
    }

    @Test
    public void FilmsFindTest5() {
        FilmsManager manager = new FilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);
        String[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};
        String[] actual = manager.findAll();
        assertArrayEquals(actual, expected);
    }

    @Test
    public void FilmsFindLastTest6() {
        FilmsManager manager = new FilmsManager(5);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        String[] expected = {film10, film9, film8, film7, film6};
        String[] actual = manager.findLast();
    }
}

