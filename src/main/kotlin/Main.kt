import javax.swing.text.Caret

fun main() {
//qtn1
    var names = listOf("Bellah", "Dan", "Rayan", "Juliet", "shat", "flo", "Ema", "Sulait", "jane", "Tasha","Kathy")
val evenNumberedStrings= Names( names)
println(evenNumberedStrings)

//qtn2
  val heights= peoplesHeights(listOf(21.0,62.0,50.0,80.0))
println( heights)

//qtn3
    var person1= PersonStudent("Bella",21,61.2,60.3)
    var person2= PersonStudent("Rayan",8,39.2,30.0)
    var person3= PersonStudent("Juliet",18,67.2,88.0)

    var newlists= listOf(person1,person2,person3)
var sortedlist=Persons(newlists)
    println(sortedlist)


    //qtn4
    println(newlists.plus(otherTwo))
    //qtn5

  var vehicles = listOf(
     Car("kdg",23.0),
      Car("kkg",29.0),
      Car("kkk",80.0)

  )
   var avgMileageVehicles=carVehicle(vehicles)
    println(avgMileageVehicles)
 }
                               //1
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices  index 2,4,6 etc
fun Names(names: List<String>):List<String>{
    return names.filter { name -> names.indexOf(name) % 2 == 0 }

}

                               //2
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun peoplesHeights( numbers: List<Double>): Pair<Double ,Double>{

     return Pair( numbers.sum(),
    numbers.average()
        )



 }


                               //3

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
   data class PersonStudent ( var name: String, var age:Int, var height:Double, var weight:Double)
fun Persons(person:List<PersonStudent>):List<PersonStudent>{
    return person.sortedByDescending { student -> student.age }


}
                                //4
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
val otherTwo= listOf(
        PersonStudent("Mayanja",16,55.0,40.0),
                                    PersonStudent("Mayanja",16,55.0,40.0)

)










                            //5

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car( var registration:String, var mileage:Double)
fun carVehicle( vehicles: List<Car> ):Double{

    val avgMileage = vehicles.sumOf{ car-> car.mileage }/ vehicles.size
    return avgMileage


}
