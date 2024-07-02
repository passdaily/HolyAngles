package info.passdaily.holy_angles_staff.typeofuser.common_staff_admin.exam_center.mark_register

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import info.passdaily.holy_angles_staff.R
import info.passdaily.holy_angles_staff.databinding.BottomMarkRegisterCbseBinding
import info.passdaily.holy_angles_staff.model.*
import info.passdaily.holy_angles_staff.services.Utils
import info.passdaily.holy_angles_staff.services.ViewModelFactory
import info.passdaily.holy_angles_staff.services.client_manager.ApiClient
import info.passdaily.holy_angles_staff.services.client_manager.NetworkLayerStaff


@Suppress("DEPRECATION")
class BottomMarkRegisterCBSE : BottomSheetDialogFragment {
    private lateinit var markRegisterViewModel: MarkRegisterViewModel

    lateinit var markRegisterCBSEClicker: MarkRegisterCBSEClicker
    var sTUDENTNAME = ""
    var mark = ArrayList<MarkRegisterKGToIVModel.Mark>()
    var position = 0
    var recyclerView: RecyclerView? = null

    private var _binding: BottomMarkRegisterCbseBinding? = null
    private val binding get() = _binding!!

    var type = 0

    constructor()

    var editPassMark = ""
    var editOutOffMark = ""

    constructor(editPassMark :String, editOutOffMark : String,
                mark: ArrayList<MarkRegisterKGToIVModel.Mark>, position: Int, markRegisterCBSEClicker: MarkRegisterCBSEClicker) {
        this.editPassMark = editPassMark
        this.editOutOffMark = editOutOffMark
        this.markRegisterCBSEClicker = markRegisterCBSEClicker
        this.mark = mark
        this.position = position
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.BottomSheetDialogStyle)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)

        markRegisterViewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(ApiClient(NetworkLayerStaff.services))
        )[MarkRegisterViewModel::class.java]

        _binding = BottomMarkRegisterCbseBinding.inflate(inflater, container, false)
        return binding.root
        // return view;
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.editTextMark.inputType = InputType.TYPE_NULL
        binding.editTextMark.keyListener = null
//
//
//
//        binding.editTextMark.onFocusChangeListener = OnFocusChangeListener { _, _ ->
//            type = 1
//        }
//
//
//
        binding.ImageView1.setOnClickListener {

            var t1 = binding.editTextMark.text.toString()
            if (t1 == "ABS" || t1 == "NIL") {
                t1 = "1"
                binding.editTextMark.setText(t1)
            } else {
                t1 += "1"
                binding.editTextMark.setText(t1)
            }

        }

        binding.ImageView2.setOnClickListener {
            var t1 = binding.editTextMark.text.toString()
            if (t1 == "ABS" || t1 == "NIL") {
                t1 = "2"
                binding.editTextMark.setText(t1)
            } else {
                t1 += "2"
                binding.editTextMark.setText(t1)
            }
        }

        binding.ImageView3.setOnClickListener {
            var t1 = binding.editTextMark.text.toString()
            if (t1 == "ABS" || t1 == "NIL") {
                t1 = "3"
                binding.editTextMark.setText(t1)
            } else {
                t1 += "3"
                binding.editTextMark.setText(t1)
            }
        }


        binding.ImageView4.setOnClickListener {
            var t1 = binding.editTextMark.text.toString()
            if (t1 == "ABS" || t1 == "NIL") {
                t1 = "4"
                binding.editTextMark.setText(t1)
            } else {
                t1 += "4"
                binding.editTextMark.setText(t1)
            }
        }

        binding.ImageView5.setOnClickListener {
            var t1 = binding.editTextMark.text.toString()
            if (t1 == "ABS" || t1 == "NIL") {
                t1 = "5"
                binding.editTextMark.setText(t1)
            } else {
                t1 += "5"
                binding.editTextMark.setText(t1)
            }
        }

        binding.ImageView6.setOnClickListener {
            var t1 = binding.editTextMark.text.toString()
            if (t1 == "ABS" || t1 == "NIL") {
                t1 = "6"
                binding.editTextMark.setText(t1)
            } else {
                t1 += "6"
                binding.editTextMark.setText(t1)
            }
        }


        binding.ImageView7.setOnClickListener {
            var t1 = binding.editTextMark.text.toString()
            if (t1 == "ABS" || t1 == "NIL") {
                t1 = "7"
                binding.editTextMark.setText(t1)
            } else {
                t1 += "7"
                binding.editTextMark.setText(t1)
            }
        }

        binding.ImageView8.setOnClickListener {
            var t1 = binding.editTextMark.text.toString()
            if (t1 == "ABS" || t1 == "NIL") {
                t1 = "8"
                binding.editTextMark.setText(t1)
            } else {
                t1 += "8"
                binding.editTextMark.setText(t1)
            }
        }

        binding.ImageView9.setOnClickListener {
            var t1 = binding.editTextMark.text.toString()
            if (t1 == "ABS" || t1 == "NIL") {
                t1 = "9"
                binding.editTextMark.setText(t1)
            } else {
                t1 += "9"
                binding.editTextMark.setText(t1)
            }
        }

        binding.ImageView0.setOnClickListener {
            var t1 = binding.editTextMark.text.toString()
            if (t1 == "ABS" || t1 == "NIL") {
                t1 = "0"
                binding.editTextMark.setText(t1)
            } else {
                t1 += "0"
                binding.editTextMark.setText(t1)
            }
        }

        binding.ImageViewDot.setOnClickListener {
            var t1 = binding.editTextMark.text.toString()
            if (t1 == "ABS" || t1 == "NIL") {
                t1 = "."
                binding.editTextMark.setText(t1)
            } else {
                t1 += "."
                binding.editTextMark.setText(t1)
            }
        }


        binding.ImageViewABS.setOnClickListener {
            binding.editTextMark.setText("ABS")
        }


        binding.ImageViewNil.setOnClickListener {
            binding.editTextMark.setText("NIL")
        }

        binding.ImageBackSpace.setOnClickListener {

            val text: String = binding.editTextMark.text.toString()
            val len = text.length
            if (len > 0) {
                if (text == "ABS" || text == "NIL") {
                    binding.editTextMark.setText("")
                } else {
                    binding.editTextMark.setText(text.substring(0, text.length - 1))
                }
            }
        }



        binding.buttonSubmit.setOnClickListener {
            Log.i(TAG,"editPassMark $editPassMark")
            Log.i(TAG,"editOutOffMark $editOutOffMark")
//            when {
//                editPassMark == "N" && editPassMark.isEmpty()-> {
//                    markRegisterKGToIVClicker.onMessageClick("Pass Mark must have some values")
//                }
//                editOutOffMark == "N" && editOutOffMark.isEmpty() -> {
//                    markRegisterKGToIVClicker.onMessageClick("Out-Off Mark must have some values")
//                }
//                editPassMark.toInt() >= editOutOffMark.toInt()->{
//                    markRegisterKGToIVClicker.onMessageClick("Pass mark is greater then Out-Off Mark")
//                }
//                else ->{

            if (/*(editPassMark != "N" && editPassMark.isNotEmpty()) && (*/ editOutOffMark != "N" && editOutOffMark.isNotEmpty())/*)*/ {
                if(/*Utils.isValidInputPoint(editPassMark) && */Utils.isValidInputPoint(editOutOffMark)){
                    if(Utils.isValidInputPoint(binding.editTextMark.text.toString())) {
                       // if (editPassMark.toDouble() <= editOutOffMark.toDouble()) {

                            if (binding.editTextMark.text.toString() != "ABS" && binding.editTextMark.text.toString() != "NIL") {
                                if (binding.editTextMark.text.toString().toDouble() <= editOutOffMark.toDouble()) {

                                    markRegisterCBSEClicker.onSubmitClickListener(
                                        binding.editTextMark.text.toString(),
                                        mark[position],
                                        position)

                                } else {
                                    markRegisterCBSEClicker.onMessageClick("Given Value is above Out-Off Mark")
                                }
                            } else if(binding.editTextMark.text.toString() == "ABS" || binding.editTextMark.text.toString() == "NIL"){
                                markRegisterCBSEClicker.onSubmitClickListener(
                                    binding.editTextMark.text.toString(),
                                    mark[position],
                                    position
                                )
                            }

//                        } else {
//                            markRegisterCBSEClicker.onMessageClick("Pass mark is greater then Out-Off Mark")
//                        }
                    }else{
                        markRegisterCBSEClicker.onMessageClick("Invalid decimal position in Total Marks")
                    }
                }else{
                    markRegisterCBSEClicker.onMessageClick("Invalid decimal position in Pass or Out-Off Mark")
                }

            }else{
//                markRegisterCBSEClicker.onMessageClick("Pass Mark or Out-Off mark must have some values")
                markRegisterCBSEClicker.onMessageClick("Out-Off mark must have some values")
            }


        }
//
        binding.imageViewLeft.setOnClickListener {
            if (position <= 0) {
                markRegisterCBSEClicker.onMessageClick("No Previous Student")
            } else {
                position--
                initShown(position)
            }
        }



        binding.imageViewRight.setOnClickListener {
            if ((position + 1) == mark.size) {
                markRegisterCBSEClicker.onMessageClick("Student Ends Here")
            } else {
                position++
                initShown(position)
            }
        }

        initShown(position)
    }

    fun initShown(position : Int){

        binding.editTextMark.clearFocus();

        binding.textViewName.text = mark[position].sTUDENTFNAME

        binding.textViewRollNo.text = "Roll.No : ${mark[position].sTUDENTROLLNUMBER}"

        if (mark[position].tOTALMARK != "N") {
            binding.editTextMark.setText(mark[position].tOTALMARK)
        }else{
            binding.editTextMark.setText("")
        }


    }

    companion object {
        var TAG = "BottomSheetFragment"
    }
}