package com.neuralnetwork.holidaycalendar2022.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.neuralnetwork.holidaycalendar2022.R

class Celebration_dec_25 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_celebration_dec_25, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = Celebration_dec_25()
    }
}