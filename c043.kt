//https://paiza.jp/career/challenges/196/retry
fun main(args: Array<String>) {
  readLine() // 要素数を取得する必要はないため変数に代入しない
  val line = readLine()!!.split(" ").map(String::toInt)
  val count = line.size-1
  val maxNum = mutableListOf<Int>()
  var maxValue = 0
  for (i in 0..count) {
    val item = line[i]
    if ( line.count {it == item} >= maxValue && maxNum.count{it == item} == 0 ) {
      maxValue = line.count {it == item}
      maxNum.add(item)
    }
  }
  println(maxNum.joinToString(separator = " "))
  }

//サンプルコード
fun main(args: Array<String>) {
  val line = mutableListOf(1, 2, 3, 1, 1, 100, 100, 100, 200)
  val count = line.size-1
  val maxNum = mutableListOf<Int>()
  var maxValue = 0
  for (i in 0..count) {
    val item = line[i]
    if ( line.count {it == item} >= maxValue && maxNum.count{it == item} == 0 ) {
      maxValue = line.count {it == item}
      maxNum.add(item)
    }
  }
  println(maxNum.joinToString(separator = " "))
  }

