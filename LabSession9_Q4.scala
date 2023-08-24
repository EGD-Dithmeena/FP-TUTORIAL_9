object LabSession9_Q4 {
  def main(args: Array[String]): Unit = {
    val account1 = new Account2("Account1", 1000.0)
    val account2 = new Account2("Account2", -500.0)
    val account3 = new Account2("Account3", 2000.0)

    val bankAccounts = List(account1, account2, account3)

    println("Negative Balance Accounts:")
    negativeBalanceAccounts(bankAccounts).foreach(println)

    println(s"\nTotal Balance of All Accounts: ${calculateTotalBalance(bankAccounts)}")

    println("\nFinal Balances After Applying Interest:")
    applyInterest(bankAccounts).foreach(println)
    }

  private def negativeBalanceAccounts(accounts: List[Account2]): List[Account2] = {
    accounts.filter(_.balance < 0)
  }

  private def calculateTotalBalance(accounts: List[Account2]): Double = {
    accounts.map(_.balance).sum
  }

  private def applyInterest(accounts: List[Account2]): List[Account2] = {
    accounts.map { account =>
      if (account.balance > 0) {
        account.balance += account.balance * 0.05
      } else {
        account.balance += account.balance * 0.1
      }
      account
    }
  }
}
