import LogicAndCodes.Companion.and_
import LogicAndCodes.Companion.equ_
import LogicAndCodes.Companion.impl_
import LogicAndCodes.Companion.nand_
import LogicAndCodes.Companion.nor_
import LogicAndCodes.Companion.or_
import LogicAndCodes.Companion.xor_

fun main(args: Array<String>) {
    val list: List<Pair<Int, Char>> = listOf(Pair(4, 'a'),
        Pair(1, 'b'), Pair(2, 'c'), Pair(2, 'a'), Pair(1, 'd'), Pair(4, 'e'))

//    println(Lists.decode(list))

    println(Lists.randomSelect(3, "abcdefgh".toList()))

// P46
//    LogicAndCodes.printTruthTable { a, b -> a.and_(a.or_(b.not())) }
//    LogicAndCodes.printTruthTable { a, b -> a.and_(b) }
//    LogicAndCodes.printTruthTable { a, b -> a.or_(b) }
//    LogicAndCodes.printTruthTable { a, b -> a.nand_(b) }
//    LogicAndCodes.printTruthTable { a, b -> a.nor_(b) }
//    LogicAndCodes.printTruthTable { a, b -> a.xor_(b) }
//    LogicAndCodes.printTruthTable { a, b -> a.impl_(b) }
//    LogicAndCodes.printTruthTable { a, b -> a.equ_(b) }
}