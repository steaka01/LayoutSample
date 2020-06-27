package com.test.layoutsample.ui.gallery

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.test.layoutsample.R
import kotlinx.android.synthetic.main.fragment_gallery.*
import kotlinx.android.synthetic.main.fragment_home.*

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        // TODO : リストビューから既存の回答を選んだ場合、入力済みの項目がある場合、 interview_qaテーブルを参照し入力させる

        val root = inflater.inflate(R.layout.fragment_gallery, container, false)

        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //TODO : 入力した項目を interview_qa テーブルに保存する

            done_button.setOnClickListener { view ->
                Navigation.findNavController(view).navigate(R.id.nav_home)
            }

        }


}
