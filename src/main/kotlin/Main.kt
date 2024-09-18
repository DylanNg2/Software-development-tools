package ie.setu

import kotlin.math.round

val fName = "Joe"
val lName = "Soap"
val gender = 'm'
val employeeId = 6143
val gSalary = 67543.21
val payePercent = 38.5
val prsiPercent = 5.2
val bonus = 1450.50
val cycle = 54.33
fun main(args: Array<String>) {
    println("Payslip Printer")
    println(getFullName())
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

    println ("""
    |_________________________________________________________________________
    |                          Monthly Payslip                                
    |_______________________________________________________________________  
    |  Employee Name: ${fName}(${gender.uppercase()})            Employee ID: ${employeeId} 
    |                                                                         
    |-------------------------------------------------------------------------
    |
    |
    |                                                                         
    |  Payment Details:                            Deduction details        
    |                                                                         
    |-------------------------------------------------------------------------
    |Salary: ${roundTwoDecimals(mSalary)}                         PayE: ${roundTwoDecimals(paye)}       
    | Bonus: ${bonus}                       Prsi: ${roundTwoDecimals(paye)}      
    |                                                                        
    |-------------------------------------------------------------------------
    |                                                                         
    | Gross:" ${roundTwoDecimals(grSalary)}                           Total Desuctions:${roundTwoDecimals(tdecu)}                                      
    |                                                                         
    |-----------------------------------------------------------------------
    |                                                                         
    |                    Net Pay: ${roundTwoDecimals(npay)}                                  
    |  |                                                                     
    |------------------------------------------------------------------------
""".trimMargin("|"))
}
fun getFullName() = when (gender){
    'm', 'M' -> "Mr. $fName $lName"
    'f', 'F' -> "Ms. $fName $lName"
    else -> "$fName $lName"
}
fun roundTwoDecimals(number: Double) = round(number * 100) / 100