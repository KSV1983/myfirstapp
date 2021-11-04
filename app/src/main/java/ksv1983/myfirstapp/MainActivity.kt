//Демонстрация жизненного цикла Activity
//Вывод строк стихотворения из textview Activity
//в лог с использованием тэга My_Own_Log_Tag и фильтрации
//Полный вывод стихотворениия в log обеспечивается в следующем порядке жизненного цикла Activity
//onCreate()->onStart()->onResume (Запуск приложеня)
//onPause()->onStop()->onDestroy (Кнопка назад)

package ksv1983.myfirstapp
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.ArrayList

private const val TAG = "MainActivity"
private const val My_Own_Log_Tag = "MyOwnLog"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv1:TextView = findViewById(R.id.text_view1)
        val tv2:TextView = findViewById(R.id.text_view2)
        Log.d(My_Own_Log_Tag, tv1.text.toString())
        Log.d(My_Own_Log_Tag, tv2.text.toString())
    }

    override fun onStart() {
        super.onStart()
        val tv3:TextView = findViewById(R.id.text_view3)
        val tv4:TextView = findViewById(R.id.text_view4)
        Log.d(My_Own_Log_Tag, tv3.text.toString())
        Log.d(My_Own_Log_Tag, tv4.text.toString())
    }

    override fun onResume() {
        super.onResume()
        val tv5:TextView = findViewById(R.id.text_view5)
        val tv6:TextView = findViewById(R.id.text_view6)
        Log.d(My_Own_Log_Tag, tv5.text.toString())
        Log.d(My_Own_Log_Tag, tv6.text.toString())
    }

    override fun onPause() {
        super.onPause()
        val tv7:TextView = findViewById(R.id.text_view7)
        val tv8:TextView = findViewById(R.id.text_view8)
        Log.d(My_Own_Log_Tag,tv7.text.toString())
        Log.d(My_Own_Log_Tag, tv8.text.toString())
    }

    override fun onStop() {
        super.onStop()
        val tv9:TextView = findViewById(R.id.text_view9)
        val tv10:TextView = findViewById(R.id.text_view10)
        Log.d(My_Own_Log_Tag, tv9.text.toString())
        Log.d(My_Own_Log_Tag, tv10.text.toString())
    }

    //данная функция не переопределена
    override fun onRestart() {
        super.onRestart()
          }

    override fun onDestroy() {
        super.onDestroy()
        val tv11:TextView = findViewById(R.id.text_view11)
        val tv12:TextView = findViewById(R.id.text_view12)
        Log.d(My_Own_Log_Tag,tv11.text.toString())
        Log.d(My_Own_Log_Tag, tv12.text.toString())
    }
}