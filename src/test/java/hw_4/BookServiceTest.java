package hw_4;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;


public class BookServiceTest {

    @Test
    public void BookRepositoryTest() {

        BookRepository mockBookRepository = mock(BookRepository.class);

        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");
        Book book3 = new Book("3", "Book3", "Author3");


        when(mockBookRepository.findAll()).thenReturn(List.of(book1, book2, book3));
        when(mockBookRepository.findById("1")).thenReturn(book1);
        when(mockBookRepository.findById("2")).thenReturn(book2);
        when(mockBookRepository.findById("3")).thenReturn(book3);

        BookService bookService = new BookService(mockBookRepository);

        assertThat(bookService.findBookById("1")).isEqualTo(book1);
        assertThat(bookService.findBookById("2")).isEqualTo(book2);
        assertThat(bookService.findBookById("3")).isEqualTo(book3);
        verify(mockBookRepository, times(1)).findById("1");
        verify(mockBookRepository, times(1)).findById("2");
        verify(mockBookRepository, times(1)).findById("3");


        assertThat(bookService.findAllBooks()).isEqualTo(List.of(book1, book2, book3));
        verify(mockBookRepository, times(1)).findAll();

    }
}