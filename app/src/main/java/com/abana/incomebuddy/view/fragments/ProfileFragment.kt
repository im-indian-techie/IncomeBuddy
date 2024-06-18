package com.abana.incomebuddy.view.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.abana.incomebuddy.R
import com.abana.incomebuddy.databinding.FragmentCalendarViewBinding
import com.abana.incomebuddy.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile)
{
    lateinit var binding: FragmentProfileBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentProfileBinding.bind(view)
    }
}