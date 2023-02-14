fun main()
{
    print("введитте r целиндра")
    var r:Double=readLine()!!.toDouble()
    print("введитте h целиндра")
    var h:Double=readLine()!!.toDouble()
    var V=0.0
    if(r>0&&h>0)
    {
        V=Math.PI*Math.pow(r,2.0)*h
        println("объем цилиндра $V")
    }
    else println("значения не могут быть отрицательными")
}