//https://paiza.jp/en_try/challenges/58/page/result
fun main(args: Array<String>){
  val list = ArrayList<String>()
  for(i in 1..2){
    val line = readLine()!!
    list.add(line)
  }
  println(list[0] + "@" + list[1])
}


