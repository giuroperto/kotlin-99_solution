import Arithmetic.Companion.isPrime
import org.junit.Test
import kotlin.test.assertEquals

class ArithmeticTests {

    // P31
    @Test
    fun`check if number is prime - true`() {
        assertEquals(true, 7.isPrime())
    }

    @Test
    fun`check if number is prime - false`() {
        assertEquals(false, 9.isPrime())
    }

    @Test
    fun`check if number is prime - zero`() {
        assertEquals(false, 0.isPrime())
    }

}