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

class BlankFragment : Fragment() {
    private lateinit var button70: Button
    private lateinit var button79: Button
    private lateinit var button80: Button
    private lateinit var button86: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)


        button70 = view.findViewById(R.id.button70)
        button79 = view.findViewById(R.id.button79)
        button80 = view.findViewById(R.id.button80)
        button86 = view.findViewById(R.id.button86)




        button70.setOnClickListener {
            val intent = Intent(requireContext(), Phone1Activity::class.java)
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

        button86.setOnClickListener {
            val intent = Intent(requireContext(), Shose1Activity::class.java)
            startActivity(intent)
        }


        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
