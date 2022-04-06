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
        public fun <T> pack(list : List<T>) : List<List<T>> {
            val newList: MutableList<List<T>> = mutableListOf()
            val subList: MutableList<T> = mutableListOf()
            var index = 0;

            if (list.isEmpty()) return newList;

            while (index <= list.lastIndex) {
                if (index != 0 && list[index] != list[index - 1]) {
                    newList.add(subList.toList())
                    subList.clear()
                }

                subList.add(list[index])

                if (index == list.lastIndex) {
                    newList.add(subList.toList())
                }

                index++;
            }
            return newList
        }

        /**
         * P10 (*) Run-length encoding of a list.
         * Use the result of problem P09 to implement the so-called run-length encoding data compression method.
         * Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates
         * of the element E.
         * Example: encode("aaaabccaadeeee".toList())
         * Returns [(4, a), (1, b), (2, c), (2, a), (1, d), (4, e)]
         */
        public fun <T> encode(list : List<T>) : List<Pair<Int,T>> {
            val packList: List<List<T>> = pack(list)
            val runLengthEncodingList: MutableList<Pair<Int, T>> = mutableListOf()

            packList.forEach {
                val tuple: Pair<Int, T> = Pair(it.size, it[0])
                runLengthEncodingList.add(tuple)
            }

            return runLengthEncodingList;
        }

        /**
         * P11 (*) Modified run-length encoding.
         * Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied
         * into the result list. Only elements with duplicates are transferred as (N, E) terms.
         * Example: encodeModified("aaaabccaadeeee".toList())
         * Returns [(4, a), b, (2, c), (2, a), d, (4, e)]
         */
        public fun encodeModified(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P12 (*) Decode a run-length encoded list.
         * Given a run-length code list generated as specified in the problem P10, construct its uncompressed version.
         * Example: decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
         * Returns [a, a, a, a, b, c, c, a, a, d, e, e, e, e]
         */
        public fun decode(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P13 (*) Run-length encoding of a list (direct solution).
         * Implement the so-called run-length encoding data compression method directly.
         * I.e. don't use other methods you've written (like P09's pack); do all the work directly.
         * Example: encodeDirect("aaaabccaadeeee".toList())
         * Returns [(4, a), (1, b), (2, c), (2, a), (1, d), (4, e)]
         */
        public fun encodeDirect(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P14 (*) Duplicate the elements of a list.
         * Example: duplicate("abccd".toList())
         * Returns [a, a, b, b, c, c, c, c, d, d]
         */
        public fun duplicate(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P15 (*) Duplicate the elements of a list a given number of times.
         * Example: duplicateN(3, "abccd".toList())
         * Returns [a, a, a, b, b, b, c, c, c, c, c, c, d, d, d]
         */
        public fun duplicateN(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P16 (*) Drop every Nth element from a list.
         * Example: drop(3, "abcdefghijk".toList())
         * Returns [a, b, d, e, g, h, j, k]
         */
        public fun drop(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P17 (*) Split a list into two parts.
         * The length of the first part is given. Use a Pair for your result.
         * Example: split(3, "abcdefghijk".toList())
         * Returns ([a, b, c], [d, e, f, g, h, i, j, k])
         */
        public fun split(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P18 (*) Extract a slice from a list.
         * Given two indices, I and K, the slice is the list containing the elements from and including the Ith
         * element up to but not including the Kth element of the original list. Start counting the elements with 0.
         * Example: slice(3, 7, "abcdefghijk".toList())
         * Returns [d, e, f, g]
         */
        public fun slice(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P19 (*) Rotate a list N places to the left.
         * Example: rotate(3, "abcdefghijk".toList())
         * Returns [d, e, f, g, h, i, j, k, a, b, c]
         * Example: rotate(-2, "abcdefghijk".toList())
         * Returns [j, k, a, b, c, d, e, f, g, h, i]
         */
        public fun rotate(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P20 (*) Remove the Kth element from a list.
         * Return the list and the removed element in a Tuple. Elements are numbered from 0.
         * Example: removeAt(1, "abcd".toList())
         * Returns ([a, c, d], b)
         */
        public fun <T> removeAt(index: Int, list : List<T>) : Pair<List<T>, T> {
            val newList: MutableList<T> = mutableListOf()
            val removedItem = list[index]

            list.forEachIndexed { idx, t ->
                if (index != idx) {
                    newList.add(t)
                }
            }

            val tuple: Pair<List<T>, T> = Pair(newList, removedItem)
            return tuple;
        }

        /**
         * P21 (*) Insert an element at a given position into a list.
         * Example: insertAt('X', 1, "abcd".toList())
         * Returns [a, X, b, c, d]
         */
        public fun insertAt(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P22 (*) Create a list containing all integers within a given range.
         * Example: range(4, 9)
         * Returns [4, 5, 6, 7, 8, 9]
         */
        public fun range(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P23 (*) Extract a given number of randomly selected elements from a list.
         * Make sure there is a way to produce deterministic results.
         * Example: randomSelect(3, "abcdefgh".toList())
         * Returns [c, h, f]
         */
        public fun randomSelect(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P24 (*) Lotto: Draw N different random numbers from the set 1..M.
         * Make sure there is a way to produce deterministic results.
         * Example: lotto(3, 49)
         * Returns [32, 28, 8]
         */
        public fun lotto(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P25 (*) Generate a random permutation of the elements of a list.
         * Make sure there is a way to produce deterministic results.
         * Hint: Use the solution of problem P23.
         * Example: randomPermute("abcdef".toList())
         * Returns [d, b, e, f, a, c]
         */
        public fun randomPermute(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
         * In how many ways can a committee of 3 be chosen from a group of 12 people?
         * There are C(12,3) = 220 possibilities, where C(N,K) denotes binomial coefficient.
         * For pure mathematicians, this result may be great. But we want to really generate all the possibilities.
         * Example: combinations(3, "abcde".toList())
         * Returns [[c, b, a], [d, b, a], [e, b, a], [d, c, a], [e, c, a],
         * [e, d, a], [d, c, b], [e, c, b], [e, d, b], [e, d, c]]
         */
        public fun combinations(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P27 (**) Group the elements of a set into disjoint subsets.
         * a) In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons?
         * Write a function that generates all the possibilities.
         * Example: group3(listOf("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
         * Returns [[["Ida", "Hugo", "Gary", "Flip"], ["Evi", "David", "Carla"], ["Beat", "Aldo"]], ...
         * b) Generalize the above predicate in a way that we can specify a list of group sizes and the predicate
         * will return a list of groups.
         * Example: group(listOf(2, 2, 5), listOf("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
         * Returns [[["Ida", "Hugo", "Gary", "Flip", "Evi"], ["David", "Carla"], ["Beat", "Aldo"]], ...
         * Note that we do not want permutations of the group members, i.e. [[Aldo, Beat], ...]]
         * is the same solution as [[Beat, Aldo], ...]. However, [[Aldo, Beat], [Carla, David], ...] and
         * [[Carla, David], [Aldo, Beat], ...] are considered to be different solutions.
         * You may find more about this combinatorial problem in a good book on discrete mathematics under
         * the term multinomial coefficients.
         */
        public fun group3(list : List<Int>) : Boolean {
            return true;
        }

        /**
         * P28 (*) Sorting a list of lists according to length of sublists.
         * a) We suppose that a list contains elements that are lists themselves. The objective is to sort elements
         * of the list according to their length. E.g. short lists first, longer lists later, or vice versa.
         * Example: lengthSort(listOf("abc".toList(), "de".toList(), "fgh".toList(), "de".toList(), "ijkl".toList(),
         * "mn".toList(), "o".toList()))
         * Returns [[o], [d, e], [d, e], [m, n], [a, b, c], [f, g, h], [i, j, k, l]]
         * b) Again, we suppose that a list contains elements that are lists themselves. But this time the
         * objective is to sort elements according to their length frequency; i.e. lists with rare lengths are placed
         * first, others with more frequent lengths come later.
         * Example: lengthFreqSort(listOf("abc".toList(), "de".toList(), "fgh".toList(), "de".toList(), "ijkl".toList(),
         * "mn".toList(), "o".toList()))
         * Returns [[i, j, k, l], [o], [a, b, c], [f, g, h], [d, e], [d, e], [m, n]]
         * Note that in the above example, the first two lists in the result have length 4 and 1 and both lengths
         * appear just once. The third and fourth lists have length 3 and there are two list of this length.
         * Finally, the last three lists have length 2. This is the most frequent length.
         */
        public fun lengthSort(list : List<Int>) : Boolean {
            return true;
        }
    }
}