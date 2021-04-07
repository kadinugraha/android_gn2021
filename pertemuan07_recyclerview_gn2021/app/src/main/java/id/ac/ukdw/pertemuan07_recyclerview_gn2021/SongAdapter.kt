package id.ac.ukdw.pertemuan07_recyclerview_gn2021

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class SongAdapter(val listSong: ArrayList<Song>): RecyclerView.Adapter<SongAdapter.SongHolder>() {
    class SongHolder(val v: View): RecyclerView.ViewHolder(v){
        fun bindView(song: Song){
            v.findViewById<TextView>(R.id.tvTitle).text = "#${song.rank} ${song.title}"
            v.findViewById<TextView>(R.id.tvSinger).text = song.singer
            v.findViewById<ImageView>(R.id.ivCover).setImageResource(song.cover)
            v.setOnClickListener {
                Toast.makeText(v.context, "${song.singer} - ${song.title}", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongAdapter.SongHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(R.layout.item_song, parent, false)
        return SongHolder(v)
    }

    override fun onBindViewHolder(holder: SongAdapter.SongHolder, position: Int) {
        holder.bindView(listSong[position])
    }

    override fun getItemCount(): Int {
        return listSong.size
    }
}