package com.example.ds13

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.ds13.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var nameList = ArrayList<String>()

        nameList.add("1")
        nameList.add("2")
        nameList.add("3")
        nameList.add("4")
        nameList.add("5")
        nameList.add("6")
        nameList.add("7")
        nameList.add("8")
        nameList.add("9")
        nameList.add("10")
        nameList.add("11")
        nameList.add("12")
        nameList.add("13")
        nameList.add("14")
        nameList.add("15")
        nameList.add("16")
        nameList.add("17")
        nameList.add("18")
        nameList.add("19")
        nameList.add("20")
        nameList.add("21")
        nameList.add("22")
        nameList.add("23")
        nameList.add("24")
        nameList.add("25")
        nameList.add("26")
        nameList.add("27")
        nameList.add("28")
        nameList.add("29")
        nameList.add("30")

        var positionList = ArrayList<String>()
        positionList.add("1")
        positionList.add("3")
        positionList.add("5")
        positionList.add("7")
        positionList.add("9")
        positionList.add("11")
        positionList.add("13")
        positionList.add("15")
        positionList.add("17")
        positionList.add("19")
        positionList.add("21")
        positionList.add("23")
        positionList.add("25")
        positionList.add("27")
        positionList.add("29")
        positionList.add("31")
        positionList.add("33")
        positionList.add("35")
        positionList.add("37")
        positionList.add("39")
        positionList.add("41")
        positionList.add("43")
        positionList.add("45")
        positionList.add("47")
        positionList.add("49")
        positionList.add("51")
        positionList.add("53")
        positionList.add("55")
        positionList.add("57")
        positionList.add("59")

        val myAdapter = ArrayAdapter( this, R.layout.simple_list_item_1, positionList)
        binding.listView.adapter = myAdapter

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Элемент\n${nameList[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}