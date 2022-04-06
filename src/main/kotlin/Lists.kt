import kotlin.reflect.typeOf

class Lists {
    companion object {

        /**
         * P01 (*) Find the last element of a list.
         * Example: last(listOf(1, 1, 2, 3, 5, 8))
         * Returns 8
         */
        public fun <T> last(list : List<T>) : T {
            return list[list.lastIndex]
        }

        /**
         * P02 (*) Find the last but one element of a list.
         * Example: penultimate(listOf(1, 1, 2, 3, 5, 8))
         * Returns 5
         */
        public fun <T> penultimate(list : List<T>) : T? {
            var item: T? = null
            try {
                item = list[list.size - 2]
            } catch (e: ArrayIndexOutOfBoundsException) {
                println("Index is out of bound!")
            }
            return item;
        }

        /**
         * P03 (*) Find the Nth element of a list.
         * By convention, the first element in the list is element 0.
         * Example: nth(2, listOf(1, 1, 2, 3, 5, 8))
         * Returns 2
         */
        public fun <T> nth(index: Int, list : List<T>) : T? {
            var item: T? = null;
            try {
                item = list[index]
            } catch (e: ArrayIndexOutOfBoundsException) {
                println("Index is out of bound!")
            }
            return item
        }

        /**
         * P04 (*) Find the number of elements of a list.
         * Example: length(listOf(1, 1, 2, 3, 5, 8))
         * Returns 6
         */
        public fun <T> length(list : List<T>) : Int {
            var numberOfElements = 0
            list.forEach { _ -> numberOfElements++; }
            return numberOfElements
        }

        /**
         * P05 (*) Reverse a list.
         * Example: reverse(listOf(1, 1, 2, 3, 5, 8))
         * Returns [8, 5, 3, 2, 1, 1]
         */
        public fun <T> reverse(list : List<T>) : List<T> {
            val reversedList: MutableList<T> = mutableListOf()
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
        public fun <T> isPalindrome(list : List<T>) : Boolean {
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
        public fun <T> flatten(list : List<T>) : List<T> {
            val newList: MutableList<T> = mutableListOf()
            var index = 0;

            while (index <= list.size - 1) {
                if (list[index] is List<*>) {
                    newList.addAll(flatten(list[index] as List<T>))
                } else {
                    newList.add(list[index])
                }
                index++;
            }
            return newList
        }

        /**
         * P08 (*) Eliminate consecutive duplicates of list elements.
         * If a list contains repeated elements, they should be replaced with a single copy of the element.
         * The order of the elements should not be changed.
         * Example: compress("aaaabccaadeeee".toList())
         * Returns [a, b, c, a, d, e]
         */
        public fun <T> compress(list : List<T>) : List<T> {
            val newList: MutableList<T> = mutableListOf()
            var index = 0;

            while (index <= list.lastIndex) {
                if (index == 0 || list[index] != list[index - 1]) {
                    newList.add(list[index])
                }
                index++;
            }
            return newList
        }

        /**
         * P09 (*) Pack consecutive duplicates of list elements into sublists.
         * If a list contains repeated elements, they should be placed in separate sublists.
         * Example: pack("aaaabccaadeeee".toList())
         * Returns [[a, a, a, a], [b], [c, c], [a, a], [d], [e, e, e, e]]
         */
        public fun pack(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P10 (*) Run-length encoding of a list.
         * Use the result of problem P09 to implement the so-called run-length encoding data compression method.
         * Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates
         * of the element E.
         * Example: encode("aaaabccaadeeee".toList())
         * Returns [(4, a), (1, b), (2, c), (2, a), (1, d), (4, e)]
         */
        public fun encode(list : List<Int>) : Boolean {
            return true;
        }
    }
}