import kotlin.math.sqrt

fun main()
{
    print("введитте x точки")
    var x: Double = readLine()!!.toDouble()
    print("введитте y точки")
    var y: Double = readLine()!!.toDouble()
    print("введитте r окружности")
    var r: Double = readLine()!!.toDouble()
    var s=0.0
    if (r>0)
    {
        s= sqrt(Math.pow(x,2.0)+Math.pow(y,2.0))
        if(s<=r)println("принадлежит")
        else println("непринадлежит")

    }
    else println("значения r не может бытьотрицательными")
}