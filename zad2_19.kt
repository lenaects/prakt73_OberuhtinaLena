import kotlin.math.max
import kotlin.math.min
fun main()
{
    print("введитте x1 точки M1")
    var x1: Double = readLine()!!.toDouble()
    print("введитте y1 точки M1")
    var y1: Double = readLine()!!.toDouble()
    print("введитте x2 точки M2")
    var x2: Double = readLine()!!.toDouble()
    print("введитте y2 точки M2")
    var y2: Double = readLine()!!.toDouble()
    print("введитте x3 точки N1")
    var x3: Double = readLine()!!.toDouble()
    print("введитте y3 точки N1")
    var y3: Double = readLine()!!.toDouble()
    print("введитте x4 точки N2")
    var x4: Double = readLine()!!.toDouble()
    print("введитте y4 точки N2")
    var y4: Double = readLine()!!.toDouble()
    var S=0.0
    var left= max(x1,x3)
    var  top= min(y2,y4)
    var bottom= max(y1,y3)
    var right=min(x2,x4)
    var width=right-left
    var height=top-bottom
    if(width<=0&&height<=0) println("прямоугольники не пересекаються")
    else
    {
        S=width*height
        println("плошадь равна $S")
    }

}