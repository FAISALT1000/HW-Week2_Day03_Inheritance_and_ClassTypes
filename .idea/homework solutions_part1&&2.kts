// The code blow for PI=3.14
import kotlin.math.PI

// The code blow for mina function
fun main() {
    // The code blow for give Triangle value
    val T=Triangle(10.0,15.1)
    // The code blow for print Triangle info
    T.info()
    // The code blow for print Triangle  result
    T.printResult()
    // The code blow for give Rectangle value
    val R=Rectangle(10.0,11.5)
    // The code blow for print Rectangle info
    R.info()
    // The code blow for print Rectangle  result
    R.printResult()
    // The code blow for give Circle value
    val C=Circle(15.5)
    // The code blow for print Circle info
    C.info()
    // The code blow for print Circle result
    C.printResult()

}
// The code blow for Create  superclass call it Shape, we used ('open' key word) for inherited later to (Triangle,Rectangle,Circle)
open class Shape(var shapeName:String, var shapeColor:String) {

    // The code blow for Create function info
    fun info():String{
        // The code blow for print shape name shape color
        val print="shape Name: $shapeName \n shapeColor: $shapeColor"
        println(print)
        //The code blow for return print
        return print
    }
    // The code blow for Create function computeArea and make it open for overriding later
    // we need to make it open class to
    open fun computeArea():Double{
        // The code blow for return Double value
        return 0.0
    }
}
// The code blow for Create class call it Triangle,and give it 2 properties 'base' and 'height' ,
// we used super class 'Shape' and inherited to supclass class 'Triangle' ,and give it shape name and  shape color
class Triangle(val base:Double, private val height:Double):Shape("Triangle","blue"){
    // The code blow for Create function
    fun printResult(){
        // The code blow for print the Result of Triangle
        println((height*base)/2)

    }
    // The code blow for calling function computeArea and overriding to it, to return the value of the Triangle

    override fun computeArea(): Double {
        // The code blow for return Double value of Triangle result
        return (height*base)/2

    }


}
// The code blow for Create class call it Rectangle,and give it 2 properties 'width' and 'height' ,
// we used super class 'Shape' and inherited to supclass class 'Rectangle',and give it shape name and  shape color
class Rectangle(var width:Double, private var height:Double):Shape("Rectangle","black") {
    // The code blow for Create function
    fun printResult(){
        // The code blow for print the Result of Rectangle
        println( height * width)

    }
    // The code blow for calling function computeArea and overriding to it, to return the value of the Rectangle
    override fun computeArea(): Double {
        // The code blow for return Double value of Rectangle result
        return height * width
    }
}
// The code blow for Create class call it Circle,and give it 2 properties 'radius' ,
// we used super class 'Shape' and inherited to supclass class 'Circle' ,and give it shape name and  shape color
class Circle(var radius:Double): Shape("Circle","white") {
    // The code blow for Create function
    fun printResult(){
        // The code blow for print the Result of Circle
        println( PI *(radius*radius))

    }
    // The code blow for calling function computeArea and overriding to it, to return the value of the Circle
    override fun computeArea(): Double {
        // The code blow for return Double value of Circle result
        return PI *(radius*radius)
    }

}//This is the end of the codes

//---------------------------------------------------------part2---------------------------------------------------------

//Q1:What is the difference between enum classes and data classes?
//A1:
//enum class :
//are used to model types that represent a finite set of distinct values,
// such as directions, states, modes, and so forth.


//data classes :
//create classes whose main purpose is to hold data.
// some standard functionality and some utility functions are often mechanically derivable from the data.



//Q2:Which one of the object keyword ways can be used for the inheritance concept?
//A2: Object as Expression