fun main() {
    val car = Car("Subaru","F200","blue",7)
    car.carry(12)
    car.identity()


    var result =car.calculateParkingFees(7)
    println(result)

    var bus = Bus("Scania","V8","yellow",30)

    var ann = bus.maxTripFare(80.00)
    println(ann)

    var akech = bus.calculateParkingFees(6)
    println(akech)

}
open class Car( var make:String, var model:String,var color:String,var capacity:Int){

    fun carry(people:Int){
        var x = (people - capacity)
        if (people<=capacity){
            println("carrying $people passengers")
        }
        else if (people>capacity){
            println("over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int): Int{
        var Calc = hours * 20
        return Calc
    }
}
class Bus( make:String, model:String, color:String,capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(fare: Double):Double{
        var multi = capacity * fare
        return multi
    }

    override fun calculateParkingFees(hours: Int): Int {
        var park = hours * capacity
        return park
    }
}







