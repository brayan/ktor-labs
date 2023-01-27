package br.com.brayan.route

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import org.junit.Test
import kotlin.test.assertEquals

internal class OrderRoutesTest {

    @Test
    fun testGetOrder() = testApplication {
        val response = client.get("/order/2023-01-17")

        val expected = """{"number":"2023-01-17","contents":[{"item":"Ham Sandwich","amount":2,"price":5.5},{"item":"Water","amount":1,"price":1.5},{"item":"Beer","amount":3,"price":2.3},{"item":"Cheesecake","amount":1,"price":3.75}]}"""
        assertEquals(expected, response.bodyAsText())
        assertEquals(HttpStatusCode.OK, response.status)
    }
}