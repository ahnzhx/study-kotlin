package kotlinInAction.ch02.exception

import java.io.BufferedReader

fun readNumber(reader: BufferedReader): Int?{
    return try {
        val line = reader.readLine()
        Integer.parseInt(line)
    }catch (e: NumberFormatException){
        null
    }finally {
        reader.close()
    }
}