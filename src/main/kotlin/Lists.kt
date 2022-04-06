import kotlin.reflect.typeOf

class Lists {
    companion object {

        /**
         * P01 (*) Find the last element of a list.
         * Example: last(listOf(1, 1, 2, 3, 5, 8))
         * Returns 8
         */
        public fun last(list : List<*>) : Any {
            return list[list.size - 1] ?: -1
        }

        /**
         * P02 (*) Find the last but one element of a list.
         * Example: penultimate(listOf(1, 1, 2, 3, 5, 8))
         * Returns 5
         */
        public fun penultimate(list : List<*>) : Any {
            return list[list.size - 2] ?: -1
        }

        /**
         * P03 (*) Find the Nth element of a list.
         * By convention, the first element in the list is element 0.
         * Example: nth(2, listOf(1, 1, 2, 3, 5, 8))
         * Returns 2
         */
        public fun nth(index: Int, list : List<*>) : Any {
            var item: Any? = null;
            try {
                item = list[index]
            } catch (e: ArrayIndexOutOfBoundsException) {
                println("Index is out of bound!")
            }
            return item ?: -1
        }

        /**
         * P04 (*) Find the number of elements of a list.
         * Example: length(listOf(1, 1, 2, 3, 5, 8))
         * Returns 6
         */
        public fun length(list : List<*>) : Int {
            var numberOfElements = 0
            list.forEach { _ -> numberOfElements++; }
            return numberOfElements
        }

        /**
         * P05 (*) Reverse a list.
         * Example: reverse(listOf(1, 1, 2, 3, 5, 8))
         * Returns [8, 5, 3, 2, 1, 1]
         */
        public fun reverse(list : List<Int>) : List<Int> {
            val reversedList: MutableList<Int> = mutableListOf()
            var index = length(list) - 1

            while (index >= 0) {
                reversedList.add(list[index])
                index--;
            }

            return reversedList
        }

        /**
         * P06 (*) Find out whether a list is a palindrome.
         * Example: isPalindrome(listOf(1, 2, 3, 2, 1))
         * Returns true
         */
        public fun isPalindrome(list : List<Int>) : Boolean {
            var start = 0
            var end = list.size - 1

            while (start < end) {
                if (list[start] != list[end]) return false;
                start++;
                end--;
            }
            return true;
        }

        /**
         * P07 (*) Flatten a nested list structure.
         * Example: flatten(listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8))))
         * Returns [1, 1, 2, 3, 5, 8]
         */
        public fun flatten(list : List<Int>) : Boolean {
            val newList: MutableList<Int> = mutableListOf()
            var index = 0;

            while (list[index] is List<*>) {

            }

            return
        }

        /**
         * P08 (*) Eliminate consecutive duplicates of list elements.
         * If a list contains repeated elements, they should be replaced with a single copy of the element.
         * The order of the elements should not be changed.
         * Example: compress("aaaabccaadeeee".toList())
         * Returns [a, b, c, a, d, e]
         */
        public fun flatten(list : List<Int>) : Boolean {
            return
        }

        /**
         * P09 (*) Pack consecutive duplicates of list elements into sublists.
         * If a list contains repeated elements, they should be placed in separate sublists.
         * Example: pack("aaaabccaadeeee".toList())
         * Returns [[a, a, a, a], [b], [c, c], [a, a], [d], [e, e, e, e]]
         */
        public fun flatten(list : List<Int>) : Boolean {
            return
        }

        /**
         * P10 (*) Run-length encoding of a list.
         * Use the result of problem P09 to implement the so-called run-length encoding data compression method.
         * Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates
         * of the element E.
         * Example: encode("aaaabccaadeeee".toList())
         * Returns [(4, a), (1, b), (2, c), (2, a), (1, d), (4, e)]
         */
        public fun flatten(list : List<Int>) : Boolean {
            return
        }
    }
}