package id.ac.ukdw.pertemuan08_gn2021_toolbarviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //toolbar
        setSupportActionBar(findViewById(R.id.toolbar_default))
        supportActionBar?.setDisplayShowTitleEnabled(false)

        //viewpager
        val listFragment = arrayListOf<Fragment>(FragmentSatu(), FragmentDua())
        val pager = findViewById<ViewPager2>(R.id.pager)
        val pagerAdapter = PagerAdapter(this, listFragment)
        pager.adapter = pagerAdapter
    }

    class PagerAdapter(val activity: AppCompatActivity, val listFragment: ArrayList<Fragment>): FragmentStateAdapter(activity) {
        override fun getItemCount() = listFragment.size
        override fun createFragment(position: Int): Fragment = listFragment.get(position)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.menu_default, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.menu_profile -> {
            Toast.makeText(this, "Profile", Toast.LENGTH_LONG).show()
            true
        }
        R.id.menu_android -> {
            Toast.makeText(this, "Android", Toast.LENGTH_LONG).show()
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}