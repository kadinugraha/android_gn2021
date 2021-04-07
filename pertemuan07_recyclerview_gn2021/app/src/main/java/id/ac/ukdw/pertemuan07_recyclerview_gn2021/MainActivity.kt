package id.ac.ukdw.pertemuan07_recyclerview_gn2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listSong = ArrayList<Song>()
        listSong.add(Song(1, "On The Ground", "Rose", R.mipmap.rose))
        listSong.add(Song(2, "Celebrity", "IU", R.mipmap.iu))
        listSong.add(Song(3, "Future", "Red Velvet", R.mipmap.red_velvet))

        val rvSongs = findViewById<RecyclerView>(R.id.rvSongs)
        rvSongs.layoutManager = LinearLayoutManager(this)

        val adapter = SongAdapter(listSong)
        rvSongs.adapter = adapter

        listSong.add(Song(4, "ABCDE", "xyz", R.mipmap.rose))
        adapter.notifyDataSetChanged()
    }
}