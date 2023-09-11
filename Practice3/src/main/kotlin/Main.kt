
import java.util.Random

fun main(args: Array<String>) {
    // Задание 1
    val myAge = 17 // создание константы, которая хранит значение моего возраста
    val isTeenager: Boolean = 13 < myAge && myAge < 19 /* создание константы
    которая проверяет, находится ли это значени между 13 и 19 */

    // Задание 2
    val theirAge = 30 // создание константы со значением 30
    val bothTeenagers = isTeenager &&  13 < theirAge && theirAge < 19 /* создание константы, в которой
    будет через булеву логику опр. является ли человек подростком */

    // Задание 3
    val reader = "Руслан"
    val author = "Richard Lucas"
    val authorIsReader = reader == author
    /* Использование равенства строк */

    // Задание 4
    val readerBeforeAuthor = reader > author /* Сравнение строк по алфавиту */

    // Задание 5
    val myAge2 = 18
    if (13 < myAge2 && myAge2 < 19) println("Подросток") else println("Не подросток") /* Выражение которое покажет,
    подросток или не подросток по  константе myAge2 */

    // Задание 6
    val answer = if (13 < myAge2 && myAge2 < 19) "Подросток" else "Не подросток" /*  Вывод на консоль через
    константу answer */
    println(answer)

    // Задание 7
    //цикл while
    var counter = 0
    while (counter < 10){
        println("counter = $counter")
        counter++
    }

    // Задание 8
    //цикл do-while, который останавливается при roll == 0
    var counter1 = 0
    var roll = 0
    do{
        roll = Random().nextInt(6)
        counter1++
    }while(roll != 0)
    println("После $counter1 бросков, roll равен $roll")

    // Задание 9
    //цикл for, каждое значение возводится в квадрат
    val range = 1..10
    for (i in range){
        println (i * i)
    }

    // Задание 10
    //так же, как и в 9, но вывод квадратного корня
    for (i in range){
        println (Math.sqrt(i.toDouble()))
    }

    // Задание 11
    //исользования step 2
    var sum = 0
    for (row in 1 until 8 step 2){
        for (column in 0 until 8){
            sum += row * column
        }
    }
    println(sum)
}