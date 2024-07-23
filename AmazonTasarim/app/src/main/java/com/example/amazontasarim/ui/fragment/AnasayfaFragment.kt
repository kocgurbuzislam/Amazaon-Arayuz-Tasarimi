package com.example.amazontasarim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.amazontasarim.R
import com.example.amazontasarim.data.entity.IkinciData
import com.example.amazontasarim.data.entity.UcuncuData
import com.example.amazontasarim.data.entity.ilkData
import com.example.amazontasarim.databinding.FragmentAnasayfaBinding
import com.example.amazontasarim.ui.adapter.IkinciAdapter
import com.example.amazontasarim.ui.adapter.UcuncuAdapter
import com.example.amazontasarim.ui.adapter.ilkAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding =  FragmentAnasayfaBinding.inflate(inflater, container, false)

        var iv1 = ilkData(1,"citaiki")
        var iv2 = ilkData(2,"theex")
        var iv3 = ilkData(3,"mrrobot")
        var iv4 = ilkData(4,"thetomorrow")

        var ilkList = ArrayList<ilkData>()
        ilkList.add(iv1)
        ilkList.add(iv2)
        ilkList.add(iv3)
        ilkList.add(iv4)

        binding.recvw1.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val ilkAdapter = ilkAdapter(requireContext(),ilkList)
        binding.recvw1.adapter = ilkAdapter


        var ik1 = IkinciData(1,"thesummer")
        var ik2 = IkinciData(2,"theboys")
        var ik3 = IkinciData(3,"pruge")

        var ikinciList = ArrayList<IkinciData>()
        ikinciList.add(ik1)
        ikinciList.add(ik2)
        ikinciList.add(ik3)

        binding.recvw2.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        var ikinciAdapter = IkinciAdapter(requireContext(),ikinciList)
        binding.recvw2.adapter = ikinciAdapter


        var u1 = UcuncuData(1,"shotgun")
        var u2 = UcuncuData(2,"theidea")
        var u3 = UcuncuData(3,"moje")
        var u4 = UcuncuData(4,"thebeek")
        var u5 = UcuncuData(5,"blow")

        var ucuncuList = ArrayList<UcuncuData>()
        ucuncuList.add(u1)
        ucuncuList.add(u2)
        ucuncuList.add(u3)
        ucuncuList.add(u4)
        ucuncuList.add(u5)

        binding.recvw3.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        var ucuncuAdapter = UcuncuAdapter(requireContext(),ucuncuList)
        binding.recvw3.adapter = ucuncuAdapter


        return binding.root
    }


}