fun main()
{
    println("Enter the number:")
    var number= readLine()?.toInt()!!
    if (number%2==0)
    {
        println("Number is Even")

    }
    else
    {
        println("Number is Odd")
    }
}