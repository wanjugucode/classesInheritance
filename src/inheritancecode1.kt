open class Car(var make:String, var model:String,var colour:String,var capacity:Int){

    fun Carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("carrying $people passenger")
        } else {
            println("Over capacity by $x  people")
        }}

        fun identity() {
            println("I am $colour $make $model")
        }

       open fun calculateParkingFees(hours: Int):Int{
           var  parkingFees= hours*10
            return parkingFees
        }
}
class Basi(make:String,model:String,colour:String,capacity:Int):Car(make, model, colour, capacity){

}
    class Bus(make:String,model:String,colour:String,capacity:Int):Car(make, model, colour, capacity){
        fun maxTripFare(fare: Double):Double{
            var maxFare=0
            return maxFare+fare
        }


        fun calculatePackingFees(hours:Int):Int{
            return hours*capacity
        }
        }



    fun main() {
        var basi = Car("Toyota", "Carmy", "Brown", 5)
        basi.Carry(7)
        basi.Carry(4)
        basi.identity()
        var bus= Bus("Isuzu","shuttle","brown",28)
        println(bus.maxTripFare(5.0))
        println(bus.calculatePackingFees(8))

    }






