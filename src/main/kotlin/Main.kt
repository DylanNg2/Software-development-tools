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
fun menu() : Int {
    print("""
         Employee Menu for ${getFullName()}
           1. Monthly Salary
           2. Monthly PRSI
           3. Monthly PAYE
           4. Monthly Gross Pay
           5. Monthly Total Deductions
           6. Monthly Net Pay
           7. Full Payslip
          -1. Exit
         Enter Option : """)
    return readln().toInt()
}
fun main(args: Array<String>){

    var input : Int

    do {
        input = menu()
        when(input) {
            1 -> println("Monthly Salary: ${getMonthlySalary()}")
            2 -> println("Monthly PRSI: ${getMonthlyPRSI()}")
            3 ->println("Monthly PAYE: ${getMonthlyPaye()}")
            4 -> println("Monthly Gross Pay: ${getGrossMonthlyPay()}")
            5 -> println("Monthly Total Deductions: ${getTotalMonthlyDeductions()}")
            6 -> println("Monthly Net Pay: ${getNetMonthlyPay()}")
            7 -> println(getPaySlip())
            -1 -> println("Exiting App")
            else -> println("Invalid Option")
        }
        println()
    } while (input != -1)
}

fun getMonthlySalary(): Double {
    return gSalary / 12
}

fun getMonthlyPRSI(): Double {
    return getMonthlySalary() * (prsiPercent / 100)
}

fun getMonthlyPaye(): Double {
    return getMonthlySalary() * (payePercent / 100)
}

fun getGrossMonthlyPay(): Double {
    return getMonthlySalary() + (bonus / 12)
}

fun getTotalMonthlyDeductions(): Double {
    return getMonthlyPRSI() + getMonthlyPaye() + cycle
}

fun getNetMonthlyPay(): Double {
    return getGrossMonthlyPay() - getTotalMonthlyDeductions()
}

fun getPaySlip() {

    val monthlySalary = getMonthlySalary()
    val paye = getMonthlyPaye()
    val prsi = monthlySalary*(prsiPercent/100)
    val grSalary = (monthlySalary +(bonus/12))
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
    |Salary: ${roundTwoDecimals(monthlySalary)}                         PayE: ${roundTwoDecimals(paye)}       
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