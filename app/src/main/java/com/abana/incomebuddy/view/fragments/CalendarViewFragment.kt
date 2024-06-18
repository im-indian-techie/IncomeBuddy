package com.abana.incomebuddy.view.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.abana.incomebuddy.R
import com.abana.incomebuddy.databinding.FragmentCalendarViewBinding

class CalendarViewFragment : Fragment(R.layout.fragment_calendar_view)
{
    lateinit var binding: FragmentCalendarViewBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentCalendarViewBinding.bind(view)
    }
}