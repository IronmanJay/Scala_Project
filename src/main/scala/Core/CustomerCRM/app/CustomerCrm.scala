package Core.CustomerCRM.app

import Core.CustomerCRM.view.CustomerView

object CustomerCrm {

  def main(args: Array[String]): Unit = {
    new CustomerView().mainMenu()
  }

}
