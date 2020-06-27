package com.test.layoutsample.ui.home

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
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.test.layoutsample.R
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.*

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // UUIDの取得
        // var uuid = UUID.randomUUID().toString()

        fab.setOnClickListener { view ->

            //TODO : 新規作成を押すとアラートダイアログが表示され、回答者名を入力しOKを押す
            val customLayout = layoutInflater.inflate(R.layout.create_dialog, null)
            val builder: AlertDialog.Builder? = activity?.let {
                AlertDialog.Builder(it)
            }

            builder?.setTitle("回答者名の入力")
            builder?.setView(customLayout)
            builder?.setPositiveButton("作成",
                DialogInterface.OnClickListener { dialog, id ->

                    //TODO : OKを押すと interview_info テーブルに uuidカラム = uuid、nameカラム = 入力された値、create_dateカラム = 現在時刻 をInsertする
//                    var uuid = UUID.randomUUID().toString()

                    //TODO : SlideshowFragmentに移動する
                    Navigation.findNavController(view).navigate(R.id.nav_gallery)

                })
            builder?.setNegativeButton("キャンセル",
                DialogInterface.OnClickListener { dialog, id ->
                })

            val dialog: AlertDialog? = builder?.create()
            dialog?.show()


        }


    }

}