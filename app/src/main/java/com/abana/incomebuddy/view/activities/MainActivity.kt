package com.abana.incomebuddy.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.abana.incomebuddy.R
import com.abana.incomebuddy.databinding.ActivityMainBinding
import com.abana.incomebuddy.viewmodel.ProfileViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private val viewModel:ProfileViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        checkProfileData()
        val navHostFragment =supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController=navHostFragment.findNavController()
        binding.bottomNavBar.setupWithNavController(navController)

    }

    private fun checkProfileData() {
        viewModel.profileLiveData.observe(this)
        {
            if(it.isEmpty())
            {
                navController.navigate(R.id.action_global_profileFragment)
            }
        }
    }
}