import java.util.Base64

fun main() {
    print("Would you like to encode or decode: ")
    val brah = readLine()?.lowercase()

    if (brah == "encode") {
        print("String to encode: ")
        val enc = readLine()
        val encodedString = Base64.getEncoder().encodeToString(enc?.toByteArray())
        println(encodedString)
    } else if (brah == "decode") {
        print("String to decode: ")
        val dec = readLine()
        val decodedBytes = Base64.getDecoder().decode(dec)
        val decodedString = String(decodedBytes)
        println(decodedString)
    }
}