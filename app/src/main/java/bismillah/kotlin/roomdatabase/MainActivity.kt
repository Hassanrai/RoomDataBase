package bismillah.kotlin.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var dataBase: ContactDataBase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataBase = ContactDataBase.getDataBase(this)

        GlobalScope.launch {
            dataBase.contactDao().insertContact(Contact(0,"Hassan","07644744**", Date(),1))
        }
    }

    fun mygetData(view: View){
        dataBase.contactDao().getContact().observe(this, androidx.lifecycle.Observer {
            Log.d("Hassan",it.toString())
        })
    }
}


