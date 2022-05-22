package com.neuralnetwork.holidaycalendar2022.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.neuralnetwork.holidaycalendar2022.R

class Celebration_may_30 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_celebration_may_30, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = Celebration_may_30()

    }
}