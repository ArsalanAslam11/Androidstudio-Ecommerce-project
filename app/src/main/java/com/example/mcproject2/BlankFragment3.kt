package com.example.mcproject2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class BlankFragment3 : Fragment() {

    private lateinit var button78: Button
    private lateinit var button79: Button
    private lateinit var button80: Button
    private lateinit var button81: Button
    private lateinit var button82: Button
    private lateinit var button83: Button
    private lateinit var button84: Button
    private lateinit var button85: Button



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank3, container, false)


        button78 = view.findViewById(R.id.button78)
        button79 = view.findViewById(R.id.button79)
        button80 = view.findViewById(R.id.button80)
        button81 = view.findViewById(R.id.button81)
        button82 = view.findViewById(R.id.button82)
        button83 = view.findViewById(R.id.button83)
        button84 = view.findViewById(R.id.button84)
        button85 = view.findViewById(R.id.button85)



        button78.setOnClickListener {
            val intent = Intent(requireContext(), Shirt1Activity::class.java)
            startActivity(intent)
        }
        button79.setOnClickListener {
            val intent = Intent(requireContext(), Shirt2Activity::class.java)
            startActivity(intent)
        }
        button80.setOnClickListener {
            val intent = Intent(requireContext(), Shirt3Activity::class.java)
            startActivity(intent)
        }
        button81.setOnClickListener {
            val intent = Intent(requireContext(), Shirt4Activity::class.java)
            startActivity(intent)
        }
        button82.setOnClickListener {
            val intent = Intent(requireContext(), Shirt5Activity::class.java)
            startActivity(intent)
        }
        button83.setOnClickListener {
            val intent = Intent(requireContext(), Shirt6Activity::class.java)
            startActivity(intent)
        }
        button84.setOnClickListener {
            val intent = Intent(requireContext(), Shirt7Activity::class.java)
            startActivity(intent)
        }
        button85.setOnClickListener {
            val intent = Intent(requireContext(), Shirt8Activity::class.java)
            startActivity(intent)
        }


        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment3().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
