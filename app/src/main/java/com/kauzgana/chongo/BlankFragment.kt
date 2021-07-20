package com.kauzgana.chongo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.kauzgana.chongo.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bindingObj : FragmentBlankBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_blank,container,false)
        return bindingObj.root
    }


}