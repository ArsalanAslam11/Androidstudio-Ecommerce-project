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

class BlankFragment4 : Fragment() {

    private lateinit var button86: Button
    private lateinit var button87: Button
    private lateinit var button88: Button
    private lateinit var button89: Button
    private lateinit var button90: Button
    private lateinit var button91: Button
    private lateinit var button92: Button
    private lateinit var button93: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank4, container, false)


        button86 = view.findViewById(R.id.button86)
        button87 = view.findViewById(R.id.button87)
        button88 = view.findViewById(R.id.button88)
        button89 = view.findViewById(R.id.button89)
        button90 = view.findViewById(R.id.button90)
        button91 = view.findViewById(R.id.button91)
        button92 = view.findViewById(R.id.button92)
        button93 = view.findViewById(R.id.button93)



        button86.setOnClickListener {
            val intent = Intent(requireContext(), Shose1Activity::class.java)
            startActivity(intent)
        }
        button87.setOnClickListener {
            val intent = Intent(requireContext(), Shose2Activity::class.java)
            startActivity(intent)
        }
        button88.setOnClickListener {
            val intent = Intent(requireContext(), Shose3Activity::class.java)
            startActivity(intent)
        }
        button89.setOnClickListener {
            val intent = Intent(requireContext(), Shose4Activity::class.java)
            startActivity(intent)
        }
        button90.setOnClickListener {
            val intent = Intent(requireContext(), Shose5Activity::class.java)
            startActivity(intent)
        }
        button91.setOnClickListener {
            val intent = Intent(requireContext(), Shose6Activity::class.java)
            startActivity(intent)
        }
        button92.setOnClickListener {
            val intent = Intent(requireContext(), Shose7Activity::class.java)
            startActivity(intent)
        }
        button93.setOnClickListener {
            val intent = Intent(requireContext(), Shose8Activity::class.java)
            startActivity(intent)
        }


        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment4().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
