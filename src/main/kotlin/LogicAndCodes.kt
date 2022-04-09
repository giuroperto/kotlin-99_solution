import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

class LogicAndCodes {
    companion object {
        /**
         * P46 (*) Truth tables for logical expressions.
         * Define functions and_, or_, nand_, nor_, xor_, impl_, and equ_ (for logical equivalence)
         * which return true or false according to the result of their respective operations.
         * Example: true.and_(true)
         * Returns true
         * Example: true.xor_(true)
         * Returns false
         * Write a function called printTruthTable which prints the truth table of a given logical expression.
         * Example: printTruthTable{ a, b -> a.and_(a.or_(b.not_())) }
         * Returns a	b	result
         *      true	true	true
         *      true	false	true
         *      false	true	false
         *      false	false	false
         */
        public fun Boolean.and_(logical: Boolean) : Boolean {
            return this && logical
        }

        public fun Boolean.or_(logical: Boolean) : Boolean {
            return this || logical
        }

        public fun Boolean.nand_(logical: Boolean) : Boolean {
            return !(this && logical)
        }

        public fun Boolean.nor_(logical: Boolean) : Boolean {
            return !(this || logical)
        }

//        exclusive or - only one value is true
        public fun Boolean.xor_(logical: Boolean) : Boolean {
            if (this.and_(logical)) return false
            if (this.or_(logical)) return true
            return false
        }

//        Imp - Implication: true unless the first operand is true and the second operand is false when it is false
        public fun Boolean.impl_(logical: Boolean) : Boolean {
            if (this && !logical) return false
            return true
        }

//        Eqv - Equivalence: true if both operands are the same, false if they're different
        public fun Boolean.equ_(logical: Boolean) : Boolean {
            if (this.and_(logical)) return true
            if (this.nor_(logical)) return true

            return false
        }

        public fun printTruthTable(logicalFunction: (a: Boolean, b: Boolean) -> Boolean) {
            val result1: Boolean = logicalFunction(true, true)
            val result2: Boolean = logicalFunction(true, false)
            val result3: Boolean = logicalFunction(false, true)
            val result4: Boolean = logicalFunction(false, false)

            println(" a           b        result")
            println("true       true       $result1")
            println("true       false      $result2")
            println("false      true       $result3")
            println("false      false      $result4")
        }

        /**
         * P47 (*) Truth tables for logical expressions (2).
         * For Scala the task was to use implicit conversion. This is much simpler in Kotlin
         * so the task omitted assuming it was done in the previous problem.
         */
//        public fun Boolean.and_(logical: Boolean) : Boolean {
//            return this && logical
//        }

        /**
         * P48 (*) Truth tables for logical expressions (3).
         * Generalize problem 46 in such a way that the logical expression may contain any number of logical variables.
         * Example: true.xor_(true, false, true)
         * Returns true
         */
//        public fun Boolean.and_(logical: Boolean) : Boolean {
//            return this && logical
//        }

        /**
         * P49 (*) Gray code.
         * An n-bit Gray code is a sequence of n-bit strings constructed according to certain rules.
         * Find out the construction rules and write a function to generate Gray codes.
         * Example: grayCodes(bits = 1)
         * Returns [0, 1]
         * Example: grayCodes(bits = 2)
         * Returns [00, 01, 11, 10]
         * Example: grayCodes(bits = 3)
         * Returns [000, 001, 011, 010, 110, 111, 101, 100]
         */
//        public fun Boolean.and_(logical: Boolean) : Boolean {
//            return this && logical
//        }

        /**
         * P50 (**) Huffman code.
         * If you are not familiar with Huffman coding, consult internet (or a good book).
         * a) Given characters with their frequencies, e.g. {a=25, b=21, c=18, d=14, e=9, f=7, g=6}.
         * Our objective is to construct a Map, where key is character and value is the Huffman code for it.
         * Example: createEncoding(linkedMapOf(Pair('a', 25), Pair('b', 21), Pair('c', 18), Pair('d', 14),
         * Pair('e', 9), Pair('f', 7), Pair('g', 6)))
         * Returns {a=10, b=00, c=111, d=110, e=010, f=0111, g=0110}
         * b) Write encode and decode functions for conversion between String and encoded String with zeroes and ones.
         * Example: "this is a sentence".encode(encoding)
         * Returns "00110000101011100101011101001110101111011001111011000111"
         * Example: "00110000101011100101011101001110101111011001111011000111".decode(encoding)
         * Returns "this is a sentence"
         */
//        public fun Boolean.and_(logical: Boolean) : Boolean {
//            return this && logical
//        }
    }
}
