package com.ruhlan.androideditext

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ruhlan.androideditext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var hesab:Double = 230.5
    private var endirim = 10.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.hesab.text = "$hesab"

        binding.buttonHesabla.setOnClickListener {
            when(binding.radioDiscount.checkedRadioButtonId) {
                R.id.discount10 -> {
                    endirim = 10.0
                }
                R.id.discount15 -> {
                    endirim = 15.0
                } R.id.discount20 -> {
                    endirim = 20.0
                }
            }

            binding.endirimliQiymet.text = "${hesab*(1.0-endirim/100)}"
        }

        /**
         * Dark/Light Mode sample with switch
         */
//        binding.swDarkMode.setOnCheckedChangeListener { _, darkMode ->
//            if (darkMode) {
//                binding.main.setBackgroundColor(getColor(R.color.black))
//                binding.name.setTextColor(getColor(R.color.white))
//                binding.surname.setTextColor(getColor(R.color.white))
//                binding.swDarkMode.setTextColor(getColor(R.color.white))
//            } else {
//                binding.main.setBackgroundColor(getColor(R.color.white))
//                binding.name.setTextColor(getColor(R.color.black))
//                binding.surname.setTextColor(getColor(R.color.black))
//                binding.swDarkMode.setTextColor(getColor(R.color.black))
//            }
//        }
        
        

//        binding.switchMode.setOnCheckedChangeListener { compoundButton, isDarkMode ->
//            if (isDarkMode) binding.main.setBackgroundColor(getColor(R.color.black))
//             else binding.main.setBackgroundColor(getColor(R.color.white))
//        }
//        // 2textview ve 1 switch olsun -> switch enable olduqda
//
//        binding.textView.setTextColor(getColor(R.color.black))


    }
}