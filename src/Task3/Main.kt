package Task3

fun main (){
    var matrix = inputNumbersImMatrixAuto(Array(4) {Array(4) {0} })

}

fun inputNumbersImMatrixAuto (matrix : Array<Array<Int>>) {
    var a = 0
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            a += 1
            matrix[i][j] = a
            when{
               matrix[i][j] > 0  -> print("${matrix[i][j]} ")
            }

        }
        println()
    }

}
