package com.example.amazontasarim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazontasarim.data.entity.IkinciData
import com.example.amazontasarim.databinding.CardTasarim2Binding

class IkinciAdapter(var mContext: Context, var ikinciList: List<IkinciData>): RecyclerView.Adapter<IkinciAdapter.CardTasarimTutucu2>() {

    inner class CardTasarimTutucu2(var tasarim: CardTasarim2Binding): RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu2 {
        var tasarim = CardTasarim2Binding.inflate(LayoutInflater.from(mContext),parent,false)

        return CardTasarimTutucu2(tasarim)
    }


    override fun onBindViewHolder(holder: CardTasarimTutucu2, position: Int) {
        var gelenVeri = ikinciList.get(position)
        var t = holder.tasarim

        t.imageView4.setImageResource(mContext.resources.getIdentifier(gelenVeri.resim,"drawable",mContext.packageName))
    }


    override fun getItemCount(): Int {
        return ikinciList.size
    }
}