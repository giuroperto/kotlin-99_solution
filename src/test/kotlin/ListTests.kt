import org.junit.Test
import kotlin.test.assertEquals

class ListTests {

    // Lists problems
    val sampleList: List<Int> = listOf(1, 1, 2, 3, 5, 8)
    val palindromeList: List<Int> = listOf(1, 2, 3, 2, 1)
    val listToFlat: List<Any> = listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8)))

    // P01
    @Test fun`find the last element of a list`() {
        assertEquals(8, Lists.last(sampleList))
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun`find the last element of an empty list`() {
        Lists.last(listOf<Int>())
    }

    // P02
    @Test fun`find the last less one element of a list`() {
        assertEquals(5, Lists.penultimate(sampleList))
    }

    @Test fun`find the last less one element of an empty list`() {
        assertEquals(null, Lists.penultimate(listOf()))
    }

    @Test fun`find the last less one element of a list of 1`() {
        assertEquals(null, Lists.penultimate(listOf()))
    }

    // P03
    @Test fun`find the nth element of a list`() {
        assertEquals(2, Lists.nth(2, sampleList))
    }

    @Test fun`find the nth element of an empty list`() {
        assertEquals(null, Lists.nth(2, listOf()))
    }

    @Test fun`find the nth element of a list of 1`() {
        assertEquals(null, Lists.nth(2, listOf()))
    }

    @Test fun`find the nth negative element of a list`() {
        assertEquals(null, Lists.nth(-2, listOf()))
    }

    @Test fun`find the nth element of a list which is out of bound`() {
        assertEquals(null, Lists.nth(200, listOf()))
    }

    // P04
    @Test fun`find the number of elements of a list of 6`() {
        assertEquals(6, Lists.length(sampleList))
    }

    @Test fun`find the number of elements of a list of 5`() {
        assertEquals(5, Lists.length(listOf(1, 1, 2, 5, 8)))
    }

    @Test fun`find the number of elements of an empty list`() {
        assertEquals(0, Lists.length(listOf<Int>()))
    }

    // P05
    @Test fun`reverse a list of 6`() {
        assertEquals(sampleList.reversed(), Lists.reverse(sampleList))
    }

    @Test fun`reverse a list of 1`() {
        assertEquals(listOf(1).reversed(), Lists.reverse(listOf(1)))
    }

    @Test fun`reverse a list of strings`() {
        assertEquals(listOf("a", "b", "c", "d").reversed(), Lists.reverse(listOf("a", "b", "c", "d")))
    }

    @Test fun`reverse an empty list`() {
        assertEquals(listOf(), Lists.reverse(listOf<Int>()))
    }

    // P06
    @Test fun`check if a list of 6 is a palindrome - true`() {
        assertEquals(true, Lists.isPalindrome(listOf(1, 2, 3, 3, 2, 1)))
    }

    @Test fun`check if a list of 5 is a palindrome - true`() {
        assertEquals(true, Lists.isPalindrome(palindromeList))
    }

    @Test fun`check if a list of 6 is a palindrome - false`() {
        assertEquals(false, Lists.isPalindrome(sampleList))
    }

    @Test fun`check if a list of 5 is a palindrome - false`() {
        assertEquals(false, Lists.isPalindrome(listOf(1, 2, 3, 4, 5)))
    }

    @Test fun`check if an empty list is a palindrome`() {
        assertEquals(true, Lists.isPalindrome(listOf<Int>()))
    }

    @Test fun`check if a list of strings is a palindrome - true`() {
        assertEquals(true, Lists.isPalindrome(listOf("a", "b", "c", "b", "a")))
    }

    @Test fun`check if a list of strings is a palindrome - false`() {
        assertEquals(false, Lists.isPalindrome(listOf("a", "b", "c", "d", "e")))
    }

    // P07
// * P07 (*) Flatten a nested list structure.
// * Example: flatten(listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8))))
// * Returns [1, 1, 2, 3, 5, 8]
// */
//public fun <T> flatten(list : List<T>) : List<T> {
//    val newList: MutableList<T> = mutableListOf()
//    var index = 0;
//
//    while (index <= list.size - 1) {
//        if (list[index] is List<*>) {
//            newList.addAll(flatten(list[index] as List<T>))
//        } else {
//            newList.add(list[index])
//        }
//        index++;
//    }
//    return newList
//}
//

    // P08
    //    println(Lists.flatten(listToFlat))
    ///**
// * P08 (*) Eliminate consecutive duplicates of list elements.
// * If a list contains repeated elements, they should be replaced with a single copy of the element.
// * The order of the elements should not be changed.
// * Example: compress("aaaabccaadeeee".toList())
// * Returns [a, b, c, a, d, e]
// */
//public fun <T> compress(list : List<T>) : List<T> {
//    val newList: MutableList<T> = mutableListOf()
//    var index = 0;
//
//    while (index <= list.lastIndex) {
//        if (index == 0 || list[index] != list[index - 1]) {
//            newList.add(list[index])
//        }
//        index++;
//    }
//    return newList
//}
//

    // P09
    //    println(Lists.compress("aaaabccaadeeee".toList()))
    ///**
// * P09 (*) Pack consecutive duplicates of list elements into sublists.
// * If a list contains repeated elements, they should be placed in separate sublists.
// * Example: pack("aaaabccaadeeee".toList())
// * Returns [[a, a, a, a], [b], [c, c], [a, a], [d], [e, e, e, e]]
// */
//public fun <T> pack(list : List<T>) : List<List<T>> {
//    val newList: MutableList<List<T>> = mutableListOf()
//    val subList: MutableList<T> = mutableListOf()
//    var index = 0;
//
//    if (list.isEmpty()) return newList;
//
//    while (index <= list.lastIndex) {
//        if (index != 0 && list[index] != list[index - 1]) {
//            newList.add(subList.toList())
//            subList.clear()
//        }
//
//        subList.add(list[index])
//
//        if (index == list.lastIndex) {
//            newList.add(subList.toList())
//        }
//
//        index++;
//    }
//    return newList
//}
//


    // P10
    //    println(Lists.pack("aaaabccaadeeee".toList()))
    //    println(Lists.encode("aaaabccaadeeee".toList()))
    ///**
// * P10 (*) Run-length encoding of a list.
// * Use the result of problem P09 to implement the so-called run-length encoding data compression method.
// * Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates
// * of the element E.
// * Example: encode("aaaabccaadeeee".toList())
// * Returns [(4, a), (1, b), (2, c), (2, a), (1, d), (4, e)]
// */
//public fun <T> encode(list : List<T>) : List<Pair<Int,T>> {
//    val packList: List<List<T>> = pack(list)
//    val runLengthEncodingList: MutableList<Pair<Int, T>> = mutableListOf()
//
//    packList.forEach {
//        val tuple: Pair<Int, T> = Pair(it.size, it[0])
//        runLengthEncodingList.add(tuple)
//    }
//
//    return runLengthEncodingList;
//}
//


    // P11
    @Test fun`modify run-length encoding to show single elements simply copied in the result list`() {
        assertEquals(listOf(Pair(4, 'a'), 'b', Pair(2, 'c'), Pair(2, 'a'), 'd', Pair(4, 'e')),
            Lists.encodeModified("aaaabccaadeeee".toList()))
    }

    @Test fun`modify run-length encoding to show single elements simply copied in the result list - all single`() {
        assertEquals(listOf('a', 'b', 'c', 'a', 'd', 'e'), Lists.encodeModified("abcade".toList()))
    }

    @Test fun`modify run-length encoding to show single elements simply copied in the result list - all pairs`() {
        assertEquals(listOf(Pair(4, 'a'), Pair(2, 'b'), Pair(2, 'c'), Pair(2, 'a'), Pair(3, 'd'), Pair(4, 'e')),
            Lists.encodeModified("aaaabbccaadddeeee".toList()))
    }

    @Test fun`modify run-length encoding of empty list to show single elements simply copied in the result list`() {
        assertEquals(listOf(), Lists.encodeModified(listOf<Int>()))
    }

//    @Test(expected = IndexOutOfBoundsException::class)
//    fun`find the last element of an empty list`() {
//        Lists.last(listOf<Int>())
//    }


    // P12
    @Test fun`decode run-length encoded list - empty list`() {
        assertEquals(listOf<Char>(), Lists.decode(listOf()))
    }

    @Test fun`decode run-length encoded list - Int Char`() {
        assertEquals(listOf('a', 'a', 'a', 'a', 'c', 'c', 'a', 'a', 'd', 'e'),
            Lists.decode(listOf(Pair(4, 'a'), Pair(2, 'c'), Pair(2, 'a'), Pair(1, 'd'), Pair(1, 'e'))))
    }

    @Test fun`decode run-length encoded list - Int Int`() {
        assertEquals(listOf(1, 2, 2, 3, 4, 4, 5, 2, 2, 1),
            Lists.decode(listOf(Pair(1, 1), Pair(2, 2), Pair(1, 3), Pair(2, 4), Pair(1, 5), Pair(2, 2), Pair(1, 1))))
    }

    @Test fun`decode run-length encoded list - Int String`() {
        assertEquals(listOf("abc", "abc", "abc", "def", "def", "klm", "klm", "klm", "klm"),
            Lists.decode(listOf(Pair(3, "abc"), Pair(2, "def"), Pair(4, "klm"))))
    }
    //    println(Lists.encodeModified("aaaabccaadeeee".toList()))
    ///**
// * P12 (*) Decode a run-length encoded list.
// * Given a run-length code list generated as specified in the problem P10, construct its uncompressed version.
// * Example: decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
// * Returns [a, a, a, a, b, c, c, a, a, d, e, e, e, e]
// */
//public fun decode(list : List<Int>) : Boolean {
//    return true;
//}
//


    // P13
    @Test fun`run-length encoding of empty list directly`() {
        assertEquals(listOf(), Lists.encodeDirect(listOf<Int>()))
    }

    @Test fun`run-length encoding of a list directly`() {
        assertEquals(listOf(Pair(4, 'a'), Pair(1, 'b'), Pair(2, 'c'), Pair(2, 'a'), Pair(1, 'd'), Pair(4, 'e')),
            Lists.encodeDirect("aaaabccaadeeee".toList()))
    }

    @Test fun`run-length encoding of a list of single items directly`() {
        assertEquals(listOf(Pair(1, 'a'), Pair(1, 'b'), Pair(1, 'c'), Pair(1, 'a'), Pair(1, 'd'), Pair(1, 'e')),
            Lists.encodeDirect("abcade".toList()))
    }

    @Test fun`run-length encoding of a list of all pairs directly`() {
        assertEquals(listOf(Pair(4, 'a'), Pair(2, 'b'), Pair(2, 'c'), Pair(2, 'a'), Pair(3, 'd'), Pair(4, 'e')),
            Lists.encodeDirect("aaaabbccaadddeeee".toList()))
    }

    // P14
    @Test fun`duplicate each element of a string list`() {
        assertEquals(listOf('a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'd', 'd'),
            Lists.duplicate("abccd".toList() as List<Char>))
    }

    @Test fun`duplicate each element of an empty list`() {
        assertEquals(listOf(), Lists.duplicate(listOf<Int>()))
    }

    @Test fun`duplicate each element of an int list`() {
        assertEquals(listOf(1, 1, 2, 2, 3, 3), Lists.duplicate(listOf(1, 2, 3)))
    }

    // P15
    @Test fun`duplicate each element of a string list given a number of times 3`() {
        assertEquals(listOf('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd'),
            Lists.duplicateN(3, "abccd".toList() as List<Char>))
    }

    @Test fun`duplicate each element of a list given a number of times 1`() {
        assertEquals(sampleList, Lists.duplicateN(1, sampleList))
    }

    @Test fun`duplicate each element of an empty list given a number of times 3`() {
        assertEquals(listOf(), Lists.duplicateN(3, listOf<Int>()))
    }

    @Test fun`duplicate each element of an int list given a number of times 3`() {
        assertEquals(listOf(1, 1, 1, 2, 2, 2, 3, 3, 3), Lists.duplicateN(3, listOf(1, 2, 3)))
    }

    //    println(Lists.duplicate("abccd".toList()))


    // P16
    ///**
// * P16 (*) Drop every Nth element from a list.
// * Example: drop(3, "abcdefghijk".toList())
// * Returns [a, b, d, e, g, h, j, k]
// */
//public fun drop(list : List<Int>) : Boolean {
//    return true;
//}
//

    // P17
    //    println(Lists.drop(3, "abcdefghijk".toList()))
    ///**
// * P17 (*) Split a list into two parts.
// * The length of the first part is given. Use a Pair for your result.
// * Example: split(3, "abcdefghijk".toList())
// * Returns ([a, b, c], [d, e, f, g, h, i, j, k])
// */
//public fun <T> split(length: Int, list : List<T>) : Pair<List<T>, List<T>> {
//    val firstList: MutableList<T> = mutableListOf()
//    val secondList: MutableList<T> = mutableListOf()
//
//    list.forEachIndexed { idx, t ->
//        if (idx < length) {
//            firstList.add(t)
//        } else {
//            secondList.add(t)
//        }
//    }
//
//    val tuple: Pair<List<T>, List<T>> = Pair(firstList, secondList)
//
//    return tuple;
//}
//


    // P18
    @Test fun`extract a slice from a list - string`() {
        assertEquals(listOf("d", "e", "f", "g"),
            Lists.slice(3, 7, listOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k")))
    }

    @Test fun`extract a slice from a list - int`() {
        assertEquals(listOf(1, 2), Lists.slice(1, 3, listOf(0, 1, 2, 3, 4, 5)))
    }

    @Test fun`extract a slice from a list - indices equals to 0`() {
        assertEquals(listOf(), Lists.slice(0, 0, listOf(0, 1, 2, 3, 4, 5)))
    }

    @Test fun`extract a slice from a list - end index higher than start index`() {
        assertEquals(listOf(), Lists.slice(3, 1, listOf(0, 1, 2, 3, 4, 5)))
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun`extract a slice from a list - empty list`() {
        Lists.slice(1, 2, listOf<Int>())
    }

    // P19
    @Test fun`rotate a list - positive`() {
        assertEquals("defghijkabc".toList(), Lists.rotate(3, "abcdefghijk".toList()))
    }

    @Test fun`rotate a list - negative`() {
        assertEquals("jkabcdefghi".toList(), Lists.rotate(-2, "abcdefghijk".toList()))
    }

    @Test fun`rotate a list - zero places`() {
        assertEquals("abcdefghijk".toList(), Lists.rotate(0, "abcdefghijk".toList()))
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun`rotate a list - empty`() {
        Lists.rotate(1, listOf<Int>())
    }

    // P20

    @Test fun`remove kth element from int list`() {
        assertEquals(Pair(listOf(1, 2, 3, 5), 4), Lists.removeAt(3, listOf(1, 2, 3, 4, 5)))
    }

    @Test fun`remove kth element from string list`() {
        assertEquals(Pair(listOf("a", "ab", "abc", "abcde"), "abcd"),
            Lists.removeAt(3, listOf("a", "ab", "abc", "abcd", "abcde")))
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun`remove kth element from empty list`() {
        Lists.removeAt(3, listOf<Int>())
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun`remove kth element out of bound from list`() {
        Lists.removeAt(5, listOf(1, 2, 3))
    }

    // P21
    @Test fun`insert string element at given position`() {
        assertEquals(listOf('a', 'X', 'b', 'c', 'd'), Lists.insertAt('X',1, "abcd".toList()))
    }

    @Test fun`insert int element at given position`() {
        assertEquals(listOf(0, 1, 2, 3, 4, 5), Lists.insertAt(0,0, listOf(1, 2, 3, 4, 5)))
    }

    @Test fun`insert element at given position in empty list`() {
        assertEquals(listOf(), Lists.insertAt(0,0, listOf()))
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun`insert element at given position out of bounds`() {
        Lists.insertAt(1, 10, listOf(1, 2, 3, 4))
    }

    // P22
    @Test fun`create a range between two int values`() {
        assertEquals(listOf(1, 2, 3, 4, 5), Lists.range(1, 5))
    }

    @Test fun`create a range between two int values decreasing`() {
        assertEquals(listOf(0, 1, 2), Lists.range(2, 0))
    }

    @Test fun`create a range between two equal values`() {
        assertEquals(listOf(4), Lists.range(4, 4))
    }

    @Test fun`create a range between two negative values`() {
        assertEquals(listOf(-4, -3, -2, -1), Lists.range(-1, -4))
    }

    // P23
    @Test fun`range of 3 items to get random 3`() {
        assertEquals(listOf(3, 2, 1), Lists.randomSelect(3, listOf(3, 2, 1)))
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun`random 3 numbers of empty list`() {
        Lists.randomSelect(3, listOf<String>())
    }

    @Test fun`random 0 numbers of list of 2`() {
        assertEquals(listOf(), Lists.randomSelect(0, listOf(1, 2)))
    }

    // P24
    @Test fun`draw 0 numbers`() {
        assertEquals(listOf(), Lists.lotto(0, 4))
    }

//    @Test fun`draw 1 numbers from 1 to 1`() {
//        assertEquals(listOf(1), Lists.lotto(1, 1))
//    }

//    @Test fun`draw 3 numbers from 1 to 1`() {
//        assertEquals(listOf(1, 1, 1), Lists.lotto(3, 1))
//    }

    // P101
    @Test fun`get unique pair max char count`() {
        assertEquals(hashMapOf(Pair("a", 3), Pair("b", 2), Pair("c", 2), Pair("d", 1), Pair("e", 3)),
            Lists.getUniquePairCharCount(listOf("a", "a", "a", "b", "b", "c", "c", "d", "e", "e", "e", "a", "a")))
    }

    @Test fun`get unique pair max char count - another`() {
        assertEquals(hashMapOf(Pair("a", 3), Pair("c", 2), Pair("d", 3), Pair("e", 1)),
            Lists.getUniquePairCharCount(listOf("a", "a", "a", "c", "c", "a", "c", "d", "d", "d", "e", "a", "a")))
    }

    @Test fun`get unique pair max char count - int`() {
        assertEquals(hashMapOf(Pair(1, 1)),
            Lists.getUniquePairCharCount(listOf(1)))
    }

    @Test fun`get unique pair max char count - empty list`() {
        assertEquals(hashMapOf<String, Int>(),
            Lists.getUniquePairCharCount(listOf<String>()))
    }
}

//
///**
// * P23 (*) Extract a given number of randomly selected elements from a list.
// * Make sure there is a way to produce deterministic results.
// * Example: randomSelect(3, "abcdefgh".toList())
// * Returns [c, h, f]
// */
//public fun randomSelect(list : List<Int>) : Boolean {
//    return true;
//}
//

//
///**
// * P25 (*) Generate a random permutation of the elements of a list.
// * Make sure there is a way to produce deterministic results.
// * Hint: Use the solution of problem P23.
// * Example: randomPermute("abcdef".toList())
// * Returns [d, b, e, f, a, c]
// */
//public fun randomPermute(list : List<Int>) : Boolean {
//    return true;
//}
//
///**
// * P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
// * In how many ways can a committee of 3 be chosen from a group of 12 people?
// * There are C(12,3) = 220 possibilities, where C(N,K) denotes binomial coefficient.
// * For pure mathematicians, this result may be great. But we want to really generate all the possibilities.
// * Example: combinations(3, "abcde".toList())
// * Returns [[c, b, a], [d, b, a], [e, b, a], [d, c, a], [e, c, a],
// * [e, d, a], [d, c, b], [e, c, b], [e, d, b], [e, d, c]]
// */
//public fun combinations(list : List<Int>) : Boolean {
//    return true;
//}
//
///**
// * P27 (**) Group the elements of a set into disjoint subsets.
// * a) In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons?
// * Write a function that generates all the possibilities.
// * Example: group3(listOf("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
// * Returns [[["Ida", "Hugo", "Gary", "Flip"], ["Evi", "David", "Carla"], ["Beat", "Aldo"]], ...
// * b) Generalize the above predicate in a way that we can specify a list of group sizes and the predicate
// * will return a list of groups.
// * Example: group(listOf(2, 2, 5), listOf("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
// * Returns [[["Ida", "Hugo", "Gary", "Flip", "Evi"], ["David", "Carla"], ["Beat", "Aldo"]], ...
// * Note that we do not want permutations of the group members, i.e. [[Aldo, Beat], ...]]
// * is the same solution as [[Beat, Aldo], ...]. However, [[Aldo, Beat], [Carla, David], ...] and
// * [[Carla, David], [Aldo, Beat], ...] are considered to be different solutions.
// * You may find more about this combinatorial problem in a good book on discrete mathematics under
// * the term multinomial coefficients.
// */
//public fun group3(list : List<Int>) : Boolean {
//    return true;
//}
//
///**
// * P28 (*) Sorting a list of lists according to length of sublists.
// * a) We suppose that a list contains elements that are lists themselves. The objective is to sort elements
// * of the list according to their length. E.g. short lists first, longer lists later, or vice versa.
// * Example: lengthSort(listOf("abc".toList(), "de".toList(), "fgh".toList(), "de".toList(), "ijkl".toList(),
// * "mn".toList(), "o".toList()))
// * Returns [[o], [d, e], [d, e], [m, n], [a, b, c], [f, g, h], [i, j, k, l]]
// * b) Again, we suppose that a list contains elements that are lists themselves. But this time the
// * objective is to sort elements according to their length frequency; i.e. lists with rare lengths are placed
// * first, others with more frequent lengths come later.
// * Example: lengthFreqSort(listOf("abc".toList(), "de".toList(), "fgh".toList(), "de".toList(), "ijkl".toList(),
// * "mn".toList(), "o".toList()))
// * Returns [[i, j, k, l], [o], [a, b, c], [f, g, h], [d, e], [d, e], [m, n]]
// * Note that in the above example, the first two lists in the result have length 4 and 1 and both lengths
// * appear just once. The third and fourth lists have length 3 and there are two list of this length.
// * Finally, the last three lists have length 2. This is the most frequent length.
// */
//public fun lengthSort(list : List<Int>) : Boolean {
//    return true;
//}