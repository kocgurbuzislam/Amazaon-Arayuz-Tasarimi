package com.example.amazontasarim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazontasarim.data.entity.UcuncuData
import com.example.amazontasarim.databinding.CardTasarim3Binding

class UcuncuAdapter(var mContext: Context, var ucuncuList: List<UcuncuData>): RecyclerView.Adapter<UcuncuAdapter.CarTasarimTutucu3>() {

    inner class CarTasarimTutucu3(var tasarim: CardTasarim3Binding): RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarTasarimTutucu3 {
        var tasarim = CardTasarim3Binding.inflate(LayoutInflater.from(mContext),parent,false)
        return CarTasarimTutucu3(tasarim)
    }

    override fun onBindViewHolder(holder: CarTasarimTutucu3, position: Int) {

        var gelenVeri = ucuncuList.get(position)
        var t = holder.tasarim
        t.imageView5.setImageResource(mContext.resources.getIdentifier(gelenVeri.resim,"drawable",mContext.packageName))

    }


    override fun getItemCount(): Int {
       return ucuncuList.size
    }


}