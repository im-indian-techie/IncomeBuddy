package com.abana.incomebuddy.view.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.abana.incomebuddy.R
import com.abana.incomebuddy.databinding.FragmentBudgetEntryBinding
import com.abana.incomebuddy.databinding.FragmentCalendarViewBinding
import com.abana.incomebuddy.databinding.FragmentReportsBinding

class ReportsFragment : Fragment(R.layout.fragment_reports)
{
    lateinit var binding: FragmentReportsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentReportsBinding.bind(view)
    }
}