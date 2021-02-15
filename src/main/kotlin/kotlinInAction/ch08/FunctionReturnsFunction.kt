package kotlinInAction.ch08

enum class Delivery{ STANDARD, EXPEDITED}

class Order(val itemCount: Int)

fun getShippingCostCalculator(
    delivery: Delivery
): (Order) -> Double{
    if(delivery == Delivery.EXPEDITED){
        return { order -> 6 +1.2 * order.itemCount}
    }
    return {order -> 1.2 * order.itemCount }
}