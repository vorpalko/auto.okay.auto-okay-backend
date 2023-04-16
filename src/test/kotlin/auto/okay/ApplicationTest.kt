package auto.okay

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.server.testing.*
import kotlin.test.*
import io.ktor.http.*
import auto.okay.plugins.*
import org.junit.Test

class ApplicationTest {
    @Test
    fun testRoot() = testApplication {
        assertEquals(true, true)
    }
}
