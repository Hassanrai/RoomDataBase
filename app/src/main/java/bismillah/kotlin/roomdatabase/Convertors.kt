package bismillah.kotlin.roomdatabase

import androidx.room.TypeConverter
import java.util.*

class Convertors {
    @TypeConverter
    fun longtoDate(value: Long): Date {
        return Date(value)
    }
    @TypeConverter
    fun datetoLong(value: Date): Long{
        return value.time
    }
}