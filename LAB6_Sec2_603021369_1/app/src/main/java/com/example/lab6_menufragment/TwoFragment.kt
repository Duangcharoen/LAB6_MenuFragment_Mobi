package com.example.lab6_menufragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_one.view.*
import kotlinx.android.synthetic.main.fragment_two.view.*

/**
 * A simple [Fragment] subclass.
 */
class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_two, container, false)
        view.btnClickFragmentTwo.setOnClickListener(){
            var toast = Toast.makeText(context, "Click On Fragment Two", Toast.LENGTH_SHORT)
            toast.show()
        }
        return view
    }
}
