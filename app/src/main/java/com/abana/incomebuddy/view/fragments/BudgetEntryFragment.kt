package com.abana.incomebuddy.view.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.abana.incomebuddy.R
import com.abana.incomebuddy.databinding.FragmentBudgetEntryBinding
import com.abana.incomebuddy.databinding.FragmentCalendarViewBinding

class BudgetEntryFragment : Fragment(R.layout.fragment_budget_entry)
{
    lateinit var binding: FragmentBudgetEntryBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentBudgetEntryBinding.bind(view)
    }
}