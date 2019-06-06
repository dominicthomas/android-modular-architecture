package com.example.feature1

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.library1.TestObject

class Feature1Fragment : Fragment() {

    companion object {

        fun newInstance(): Feature1Fragment {
            return Feature1Fragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fragment1, container, false)
        val button = view.findViewById<Button>(R.id.button1)
        button.apply {
            setOnClickListener {
                Toast.makeText(context, TestObject().getValue(), Toast.LENGTH_SHORT).show()
            }
        }
        return view
    }
}