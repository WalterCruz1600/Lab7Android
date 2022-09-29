package com.example.lab7prueba2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Login.newInstance] factory method to
 * create an instance of this fragment.
 */
class Login : Fragment() {

    private lateinit var BotonToHome: Button
    private lateinit var BotonToNew: Button
    private lateinit var TextInputEmail: TextInputLayout


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        BotonToHome=view.findViewById(R.id.button_Login_ToHome)
        TextInputEmail=view.findViewById(R.id.editText_Login_Correoe)


        setListeners()



    }

    private fun setListeners() {

        BotonToHome.setOnClickListener {
            requireView().findNavController().navigate(R.id.action_login_to_home2)
        }
    }


}