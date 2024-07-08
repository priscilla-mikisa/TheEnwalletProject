package com.akirachix.theenwallet

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.theenwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvExpenses.layoutManager = LinearLayoutManager(this)
        displayExpenses()
    }
    fun displayExpenses(){
        val expense1 = ExpensensesData("WebView myWebView = (WebView) findViewById(R.id.webview);" + "myWebView.loadUrl(\"http://img191.imageshack.us/img191/7379/tronlegacys7i7wsjf.jpg\");","Salary","KES 40000","1 July 2024")
        val expense2 = ExpensensesData("http://schemas.android.com/apk/res/android","Salary","KES 40000","1 July 2024")
        val expense3 = ExpensensesData("","Salary","KES 40000","1 July 2024")
        val expense4 = ExpensensesData("","Salary","KES 40000","1 July 2024")
        val expense5 = ExpensensesData("","Salary","KES 40000","1 July 2024")
        val expense6 = ExpensensesData("","Salary","KES 40000","1 July 2024")
        val expense7 = ExpensensesData("","Salary","KES 40000","1 July 2024")
        val expense8 = ExpensensesData("","Salary","KES 40000","1 July 2024")
        val expense9 = ExpensensesData("","Salary","KES 40000","1 July 2024")
        val expense10 = ExpensensesData("","Salary","KES 40000","1 July 2024")
        val expense11 = ExpensensesData("","Salary","KES 40000","1 July 2024")



        val expenseList = listOf(expense1,expense2,expense3,expense4,expense5,expense6,expense7,expense8,expense9,expense10,expense11)
        val expensesAdapter = ExpensesAdapter(expenseList)
        binding.rvExpenses.adapter = expensesAdapter


    }
}