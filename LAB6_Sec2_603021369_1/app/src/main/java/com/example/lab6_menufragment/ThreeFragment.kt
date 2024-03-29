package com.example.lab6_menufragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_one.view.*
import kotlinx.android.synthetic.main.fragment_three.view.*

/**
 * A simple [Fragment] subclass.
 */
class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_three, container, false)
        view.btnClickFragmentThree.setOnClickListener(){
            var toast = Toast.makeText(context, "Click On Fragment Three", Toast.LENGTH_SHORT)
            toast.show()
        }
        return view
    }

}
