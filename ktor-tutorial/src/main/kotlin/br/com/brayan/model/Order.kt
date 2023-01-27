package br.com.brayan.model

import kotlinx.serialization.Serializable

@Serializable
data class Order(
    val number: String,
    val contents: List<OrderItem>,
)

val orderStorage = listOf(
    Order(
        number = "2023-01-17",
        contents = listOf(
            OrderItem("Ham Sandwich", 2, 5.50),
            OrderItem("Water", 1, 1.50),
            OrderItem("Beer", 3, 2.30),
            OrderItem("Cheesecake", 1, 3.75),
        ),
    ),
    Order(
        number = "2023-01-16",
        contents = listOf(
            OrderItem("Cheeseburger", 1, 8.50),
            OrderItem("Water", 2, 1.50),
            OrderItem("Coke", 2, 1.76),
            OrderItem("Ice Cream", 1, 2.35),
        ),
    ),
)