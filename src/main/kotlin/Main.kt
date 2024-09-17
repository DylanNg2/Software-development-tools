package ie.setu

import javax.print.event.PrintJobEvent
val fName = "Joe"
val lName = "Soap"
val geneder = "(m)"
val employeeId = 6143
val gSalary = 67543.21
val payePercent = 38.5
val prsiPercent = 5.2
val bonus = 1450.50
val cycle = 54.33
fun main(args: Array<String>) {
    paySlipPrinter()
}
fun paySlipPrinter() {

    val mSalary = (gSalary/12)
    val paye = mSalary*(payePercent/100)
    val prsi = mSalary*(prsiPercent/100)
    val tDecu = (paye + prsi +cycle)
    val grSalary = (mSalary +(bonus/12))
    val tdecu= (paye+prsi+cycle)
    val npay = (grSalary-tdecu)

    println("---------------------------------------------------------------------------")
    println("|                          Monthly Payslip                                |")
    println("|--------------------------------------------------------------------------")
    println("|                                                                         |")
    println("|  Employee Name: " +  fName + " " + lName + geneder + "                Employee ID: " + employeeId + "            |")
    println("|                                                                         |")
    println("--------------------------------------------------------------------------|")
    println("|                                                                         |")
    println("|  Payment Details:                            Deduction details          |")
    println("|                                                                         |")
    println("--------------------------------------------------------------------------|")
    println("  Salary: " +mSalary+ "                          PayE: "+paye +"        |")
    println("  Bonus: " + bonus + "                          Prsi: "+prsi+"       |")
    println("|                                                                         |")
    println("--------------------------------------------------------------------------|")
    println("|                                                                         |")
    println("| Gross:" +grSalary+ "                         Total Desuctions:"+tdecu+"                                     |")
    println("|                                                                         |")
    println("--------------------------------------------------------------------------|")
    println("|                                                                         |")
    println("|                    Net Pay: "+npay+"                                         |")
    println("|                                                                         |")
    println("--------------------------------------------------------------------------|")
}