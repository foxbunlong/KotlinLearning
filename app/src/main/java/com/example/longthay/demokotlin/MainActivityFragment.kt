package com.example.longthay.demokotlin

import android.app.Activity
import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.longthay.demokotlin.interfaces.JavaListener
import com.example.longthay.demokotlin.interfaces.KotlinListener
import com.example.longthay.demokotlin.models.JavaModel
import com.example.longthay.demokotlin.models.KotlinModel

import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment() {

    val kotlinModel: KotlinModel = KotlinModel("Long Thay", 30)

    // Use of Java Model in Kotlin
    val javaModel: JavaModel = JavaModel()

    var kotlinListener: KotlinListener? = null

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        kotlinListener = activity as KotlinListener?
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

        // Init Java model
        javaModel.name = "This is Java model"

        this.etInput.setText(kotlinModel.age.toString())

        btnAdd.setOnClickListener({
            doAdd(etInput.text.toString().toInt(), 10)
//            Toast.makeText(context, javaModel.name, Toast.LENGTH_SHORT).show()
        })

        btnMinus.setOnClickListener({
            doMinus(etInput.text.toString().toInt(), 10)
//            Toast.makeText(context, javaModel.name, Toast.LENGTH_SHORT).show()
        })

        btnMultiply.setOnClickListener({
            doMultiply(etInput.text.toString().toInt(), 2)
//            Toast.makeText(context, javaModel.name, Toast.LENGTH_SHORT).show()
        })

        btnDivide.setOnClickListener({
            doDivide(etInput.text.toString().toInt(), 2)
//            Toast.makeText(context, javaModel.name, Toast.LENGTH_SHORT).show()
        })
    }

    fun doAdd(a: Int, b: Int) {
        val total = a + b
        etInput.setText(total.toString())
        kotlinModel.age = total
        tvResult.text = resources.getString(R.string.result, kotlinModel.name, kotlinModel.age)
        kotlinListener!!.onDataSuccess(kotlinModel.age)
    }

    fun doMinus(a: Int, b: Int) {
        val total = a - b
        etInput.setText(total.toString())
        kotlinModel.age = total
        tvResult.text = resources.getString(R.string.result, kotlinModel.name, kotlinModel.age)
        kotlinListener!!.onDataSuccess(kotlinModel.age)
    }

    fun doMultiply(a: Int, b: Int) {
        val total = a * b
        etInput.setText(total.toString())
        kotlinModel.age = total
        tvResult.text = resources.getString(R.string.result, kotlinModel.name, kotlinModel.age)
        kotlinListener!!.onDataSuccess(kotlinModel.age)
    }

    fun doDivide(a: Int, b: Int) {
        val total = a / b
        etInput.setText(total.toString())
        kotlinModel.age = total
        tvResult.text = resources.getString(R.string.result, kotlinModel.name, kotlinModel.age)
        kotlinListener!!.onDataSuccess(kotlinModel.age)
    }
}
