fun main(args: Array<String>) {
    val cardNum = readLine()!!.toInt()
  	val cardList = readLine()!!.split(" ").map(String::toInt).sortedDescending()
  	val totalAliceCardList = cardList.filterIndexed {index,num -> index % 2 == 0 }.sum()
  	val totalBobCardList = cardList.filterIndexed {index,num -> index % 2 == 1 }.sum()
   
   println( totalAliceCardList - totalBobCardList )
}
