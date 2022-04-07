import LogicAndCodes.Companion.and_
import LogicAndCodes.Companion.equ_
import LogicAndCodes.Companion.impl_
import LogicAndCodes.Companion.nand_
import LogicAndCodes.Companion.nor_
import LogicAndCodes.Companion.or_
import LogicAndCodes.Companion.xor_
import org.junit.Test
import kotlin.test.assertEquals

class LogicAndCodesTests {

    // P46
    @Test
    fun`check if two booleans result are true - true and true`() {
        assertEquals(true, true.and_(true))
    }

    @Test
    fun`check if two booleans result are true - true and false`() {
        assertEquals(false, true.and_(false))
    }

    @Test
    fun`check if two booleans result are true - false and true`() {
        assertEquals(false, false.and_(true))
    }

    @Test
    fun`check if two booleans result are true - false and false`() {
        assertEquals(false, false.and_(false))
    }

    @Test
    fun`check if one of two booleans result are true - true and true`() {
        assertEquals(true, true.or_(true))
    }

    @Test
    fun`check if one of two booleans result are true - true and false`() {
        assertEquals(true, true.or_(false))
    }

    @Test
    fun`check if one of two booleans result are true - false and true`() {
        assertEquals(true, false.or_(true))
    }

    @Test
    fun`check if one of two booleans result are true - false and false`() {
        assertEquals(false, false.or_(false))
    }

    @Test
    fun`check if two booleans result are true and invert it - true and true`() {
        assertEquals(false, true.nand_(true))
    }

    @Test
    fun`check if two booleans result are true and invert it - true and false`() {
        assertEquals(true, true.nand_(false))
    }

    @Test
    fun`check if two booleans result are true and invert it - false and true`() {
        assertEquals(true, false.nand_(true))
    }

    @Test
    fun`check if two booleans result are true and invert it - false and false`() {
        assertEquals(true, false.nand_(false))
    }

    @Test
    fun`check if one of two booleans result are true and invert it - true and true`() {
        assertEquals(false, true.nor_(true))
    }

    @Test
    fun`check if one of two booleans result are true and invert it - true and false`() {
        assertEquals(false, true.nor_(false))
    }

    @Test
    fun`check if one of two booleans result are true and invert it - false and true`() {
        assertEquals(false, false.nor_(true))
    }

    @Test
    fun`check if one of two booleans result are true and invert it - false and false`() {
        assertEquals(true, false.nor_(false))
    }

    @Test
    fun`check if only one of two booleans result are true - true and true`() {
        assertEquals(false, true.xor_(true))
    }

    @Test
    fun`check if only one of two booleans result are true - true and false`() {
        assertEquals(true, true.xor_(false))
    }

    @Test
    fun`check if only one of two booleans result are true - false and true`() {
        assertEquals(true, false.xor_(true))
    }

    @Test
    fun`check if only one of two booleans result are true - false and false`() {
        assertEquals(false, false.xor_(false))
    }

    @Test
    fun`check if both booleans have the same value - true and true`() {
        assertEquals(true, true.equ_(true))
    }

    @Test
    fun`check if both booleans have the same value - true and false`() {
        assertEquals(false, true.equ_(false))
    }

    @Test
    fun`check if both booleans have the same value - false and true`() {
        assertEquals(false, false.equ_(true))
    }

    @Test
    fun`check if both booleans have the same value - false and false`() {
        assertEquals(true, false.equ_(false))
    }

    // impl_
    @Test
    fun`check implication of booleans - true and true`() {
        assertEquals(true, true.impl_(true))
    }

    @Test
    fun`check implication of booleans - true and false`() {
        assertEquals(false, true.impl_(false))
    }

    @Test
    fun`check implication of booleans - false and true`() {
        assertEquals(true, false.impl_(true))
    }

    @Test
    fun`check implication of booleans - false and false`() {
        assertEquals(true, false.impl_(false))
    }
}