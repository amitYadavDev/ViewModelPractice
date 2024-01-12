package amitapps.media.viewmodelpractice

import amitapps.media.viewmodelpractice.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btn.setOnClickListener{
            viewModel.incrementValue()
        }

        binding.btn1.setOnClickListener {
            viewModel.decrementValue()
        }
        viewModel.counter.observe(this) {
            binding.text.text = it.toString()
        }
    }
}