//https://paiza.jp/challenges/53/show
fun main(args: Array<String>){
  val list = readLine()!!.split(" ").map(String::toInt)
  println(list[1]!!.toInt() -  list[0]!!.toInt())
  }