package Task1
fun main(){
    println("Введите email")
    var email = readln()
    println("Введите пароль")
    var password = readln()
    var info = Registration(email , password)
    println(" Ваша почта в верхнем регистре ${info.getemail()} \n" +
            " ваш пароль ${info.setpassword()}")
}

class Registration (email: String , password: String) {
  private  var email = email
    var password = password

    fun getemail () = email.toUpperCase()

    fun setpassword() {
        if (password.length < 6) {
            println("Длина пароля не соответветсвует требованиям")
        }else println(password)

    }


}
