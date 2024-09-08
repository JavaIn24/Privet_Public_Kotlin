package Task2

fun main (){
    var matrix = numbersInMatrix(arrayOf(
        arrayOf(1,2,3,4),
        arrayOf(5,6,7,8),
        arrayOf(9,10,11,12),
        arrayOf(13,14,15,16)
    ))


}
fun numbersInMatrix (matrix : Array<Array<Int>>){
    for (i in matrix.indices){
        for (j in matrix[i].indices){
            if (matrix[i][j] % 2 == 0){
                print("${matrix[i][j]} ")
            }
        }
    }
}