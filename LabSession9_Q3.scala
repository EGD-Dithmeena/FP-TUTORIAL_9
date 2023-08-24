object LabSession9_Q3 {
  def main(args: Array[String]): Unit = {
    val account1 = new Account1("Account1", 1000.0)
    val account2 = new Account1("GivenAccount1", 500.0)

    println(s"Current Account Balance")
    println(s"***********************")
    println(account1)
    println(account2)
    println(s"\n")

    println(s"Transactions Made")
    println(s"*****************")
    account1.deposit(200.0)
    account1.withdraw(100.0)
    account1.transfer(account2, 300.0)
    println(s"\n")

    println(s"New Account Balance")
    println(s"*******************")
    println(account1)
    println(account2)
  }
}
