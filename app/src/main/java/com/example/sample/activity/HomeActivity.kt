package com.example.velvetlifestyleassignment.activity

import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.PagerAdapter
import com.example.sample.R
import com.example.sample.databinding.ActivityHomeBinding
import com.example.velvetlifestyleassignment.adapter.BannerSliderAdapter
import com.example.velvetlifestyleassignment.adapter.ThumbnailSliderAdapter
import com.example.velvetlifestyleassignment.viewmodel.MasterViewModel
import dagger.android.AndroidInjection

class HomeActivity : BaseActivity<ActivityHomeBinding>(),
    ThumbnailSliderAdapter.ClickCallbacks {

    private lateinit var masterViewModel: MasterViewModel

    var images: Array<String> = arrayOf(
        "https://d32baadbbpueqt.cloudfront.net/dashboard/1602700732Festive-Glam-Kit-Mobile-Homepage-Banner.jpg",
        "https://d32baadbbpueqt.cloudfront.net/dashboard/1602442711MAH--Homepage-banner_600x500_App.gif",
        "https://d32baadbbpueqt.cloudfront.net/dashboard/1602233360Lockdown-wedding-makeup-look---Mobile-banner.jpg"
    )

    var thumbnailImg: Array<String> = arrayOf(
        "",
        "https://cdn.shopify.com/s/files/1/0906/2558/products/sugar-cosmetics-matte-as-hell-crayon-lipstick-01-scarlett-o-hara-red-13204789100627.jpg?v=1592821755",
        "https://cdn.shopify.com/s/files/1/0906/2558/products/sugar-cosmetics-smudge-me-not-liquid-lipstick-01-brazen-raisin-burgundy-13200741138515.jpg?v=1577247037"
    )

    var thumbnailTitle: Array<String> = arrayOf(
        "Smudge Me Not Liquid Lipstick Minis Set",
        "Matte As Hell Crayon Lipstick",
        "Smudge Me Not Liquid Lipstick"
    )

    lateinit var thumbnailSliderAdapter: ThumbnailSliderAdapter
    var mLayoutManager: LinearLayoutManager? = null

    override val layoutId: Int
        get() = R.layout.activity_home

    override fun init() {
        masterViewModel = ViewModelProviders.of(this).get(MasterViewModel::class.java)
        //AndroidInjection.inject(this)
        setupViewPager()
        setThumbnailScrollView()
        masterViewModel.getMasterData()
    }

    override fun onResume() {
        super.onResume()
    }

    private fun setupViewPager() {
        val adapter: PagerAdapter = BannerSliderAdapter(applicationContext, images)
        binding.viewPager.adapter = adapter

        binding.indicator.setViewPager(binding.viewPager)
        val density = resources.displayMetrics.density
        binding.indicator.radius = 3 * density
    }

    private fun setThumbnailScrollView() {
        mLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        thumbnailSliderAdapter = ThumbnailSliderAdapter(this, this, thumbnailImg, thumbnailTitle)

        binding.rvProductList.layoutManager = mLayoutManager
        binding.rvProductList.adapter = thumbnailSliderAdapter

        /*binding.rvProductList.setBackgroundColor(
            ContextCompat.getColor(
                this,
                android.R.color.transparent
            )
        )*/

    }

    override fun revokeSelected(position: Int) {

    }
}