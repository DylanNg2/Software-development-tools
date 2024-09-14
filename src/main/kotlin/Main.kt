package ie.setu

import javax.print.event.PrintJobEvent

fun main() {
    typeInference()
}
fun typeInference() {
    println("===========Pay=Slip=Printer===========")
    val fName = "Joe"
    val lName = "Soap"
    val geneder = "(m)"
    val employeeId = 6143
    val gSalary = 67543.21
    val payePercent = 38.5
    val prsiPercent = 5.2
    val bonus = 1450.50
    val cycle = 54.33

    val mSalary = gSalary/12
    val paye = (payePercent/100)*mSalary
    val prsi = (prsiPercent/100)*mSalary
    val tDecu = paye + prsi +cycle
    val nSalary = mSalary- tDecu
    val mBonus = mSalary -tDecu
    val grSalary = mSalary +mBonus
    val tdecu= paye+prsi+cycle
    val npay = mSalary -tdecu

    println("---------------------------------------------------------------------------")
    println("|                          Monthly Payslip                                |")
    println("|--------------------------------------------------------------------------")
    println("|                                                                         |")
    println("|  Employee Name: " + fName + " " + lName + geneder + "                Employee ID: " + employeeId + "            |")
    println("|                                                                         |")
    println("--------------------------------------------------------------------------|")
    println("|                                                                         |")
    println("|  Payment Details:                            Deduction details          |")
    println("|                                                                         |")
    println("--------------------------------------------------------------------------|")
    println("  Salary: " +mSalary+ "                          PayE: "+paye +"        |")
    println("  Bonus: " + mBonus + "                          Prsi: "+prsi+"       |")
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